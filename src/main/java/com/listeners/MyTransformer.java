package com.listeners;


import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTransformer implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        // If we have choose not to run this test then disable it.
        String [] andValues =System.getProperty("groups").split(",");
        String [] orValues= new String[100];
        int counter =0;
        for (int i =0 ;i<andValues.length;i++){
            if(andValues[i].contains("or")){
                String [] orValue =andValues[i].split("or");
                for(int j=0 ;j<orValue.length;j++){
                    orValues[counter]=orValue[j];
                    counter=counter+1;
                }
            }
        }
       /* if(orValues.length>0){
            boolean orExist=false;
            boolean andExist=true;
            for(int i =0;i<orValues.length;i++ ){
                if(groups.containsKey(orValues[i])){
                    orExist=true;
                    break;
                }
            }
            for(int j =0;j<andValues.length;j++ ){
                if(!groups.containsKey(andValues[j])){
                    andExist=false;
                    break;
                }
            }
            if(orExist && andExist){
                return true;
            }else {
                return fasle;
            }

        }*/


        if(testMethod!=null){
            if (disableMe(testMethod.getName())){
                annotation.setEnabled(false);
            }
        }
    }

    // logic YOU control
    private boolean disableMe(String methodName) {
        String [] values=System.getProperty("skippedMethods").split(",");
        List<String> skippedMethods=Arrays.asList(values);
        return skippedMethods.contains(methodName);
    }

}
