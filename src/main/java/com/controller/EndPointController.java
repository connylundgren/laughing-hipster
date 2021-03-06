package com.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by jonas on 2014-11-21.
 */
@RestController
public class EndPointController {
    Gson gson = new GsonBuilder().create();

    @Autowired
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    @RequestMapping("/endpoints")
    public Set<RequestMappingInfo> getEndpoints(){
        return requestMappingHandlerMapping.getHandlerMethods().keySet();
    }

    @RequestMapping("/")
    public String index() {
        Class c = LeagueRestController.class;
        MethodList methodList = new MethodList();
        methodList.methods = new ArrayList<MethodContainer>();

        Method[] methods = c.getDeclaredMethods();
        getParamMap(methods, methodList);

        c = TeamRestController.class;
        methods = c.getDeclaredMethods();
        getParamMap(methods, methodList);

        c = PlayerRestController.class;
        methods = c.getDeclaredMethods();
        getParamMap(methods, methodList);


        return gson.toJson(methodList);
    }

    private void getParamMap(Method[] methods, MethodList methodList) {
        for (Method method : methods) {
            MethodContainer methodContainer = new MethodContainer();
            methodContainer.name = method.getName();
            methodContainer.params = new ArrayList<String>();
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                methodContainer.params.add(parameter.getType().getSimpleName() + ' ' + parameter.getName());
            }
            methodList.methods.add(methodContainer);
        }
    }
}

class MethodList {
    List<MethodContainer> methods;
}

class MethodContainer {
    String name;
    List<String> params;
}


