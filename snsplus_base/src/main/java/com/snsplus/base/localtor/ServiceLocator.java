/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snsplus.base.localtor;

import java.util.Map;
import java.util.TreeMap;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Edgar Mosquera
 */
public class ServiceLocator {

    private static volatile ServiceLocator instance = null;

    private final Map<String, ServiceVerifier> services = new TreeMap<>();

    private Context ctx;

    private ServiceLocator() throws NamingException {
        ctx = new InitialContext();
    }

    public static ServiceLocator instance() throws NamingException {

        if (instance == null) {

            synchronized (ServiceLocator.class) {
                if (instance == null) {
                    instance = new ServiceLocator();
                } else {
                    if (instance.ctx == null) {
                        instance.ctx = new InitialContext();
                    }
                }
            }
        }

        return instance;
    }

    public Object get(String beanName) throws NamingException {

        ServiceVerifier vs = services.get(beanName);
        Object serviceRef = null;

        if (vs != null) {
            try {
                vs.isAlive();
                serviceRef = vs;
            } catch (Exception e) {
            }

        }
        if (serviceRef == null) {
            serviceRef = ctx.lookup(beanName);
            assert ServiceVerifier.class.isAssignableFrom(serviceRef.getClass());
            services.put(beanName, (ServiceVerifier) serviceRef);
        }
        return serviceRef;
    }
    
}
