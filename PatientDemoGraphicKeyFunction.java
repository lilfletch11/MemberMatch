/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valencehealth.vmm;

import no.priv.garshol.duke.Record;
import no.priv.garshol.duke.databases.KeyFunction;

public class PatientDemoGraphicKeyFunction implements KeyFunction {
   public PatientDemoGraphicKeyFunction(){}
   
   public String makeKey(Record record) {
      return record.getValue("Identifier");
   }

}
 