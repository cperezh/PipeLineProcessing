/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.carlos.pipelineprocessing.service;

import com.carlos.pipelineprocessing.pipeline.Mensaje;
import javax.ejb.Local;

/**
 *
 * @author Carlos
 */
@Local
public interface Servicio {
    void procesarMensaje(Mensaje mensaje);
}
