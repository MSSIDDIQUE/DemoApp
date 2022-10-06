package com.baymax.demoapp.api.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\f0\u0004H\u0082\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0002J;\u0010\t\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2 \u0010\u000f\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u0004H\u0082\b\u00a8\u0006\u0010"}, d2 = {"Lcom/baymax/demoapp/api/mappers/HoldingsResponseMappers;", "", "()V", "apiResponseMapper", "Lkotlin/Function1;", "Lcom/baymax/demoapp/api/data_trasfeer_model/ApiResponseDTO;", "Lcom/baymax/demoapp/api/domain_model/ApiResponseDM;", "mapApiResponseDTO", "input", "mapHoldingsList", "", "Lcom/baymax/demoapp/api/data_trasfeer_model/HoldingDTO;", "Lcom/baymax/demoapp/api/domain_model/HoldingsDataDM;", "mapHoldingDTO", "Lcom/baymax/demoapp/api/domain_model/HoldingDM;", "mapHoldingsListDTO", "app_debug"})
public final class HoldingsResponseMappers {
    @org.jetbrains.annotations.NotNull()
    public static final com.baymax.demoapp.api.mappers.HoldingsResponseMappers INSTANCE = null;
    
    private HoldingsResponseMappers() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.baymax.demoapp.api.data_trasfeer_model.ApiResponseDTO, com.baymax.demoapp.api.domain_model.ApiResponseDM> apiResponseMapper() {
        return null;
    }
    
    private final com.baymax.demoapp.api.domain_model.ApiResponseDM mapApiResponseDTO(com.baymax.demoapp.api.data_trasfeer_model.ApiResponseDTO input, kotlin.jvm.functions.Function1<? super java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO>, com.baymax.demoapp.api.domain_model.HoldingsDataDM> mapHoldingsList) {
        return null;
    }
    
    private final com.baymax.demoapp.api.domain_model.HoldingsDataDM mapHoldingsList(java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> input, kotlin.jvm.functions.Function1<? super java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO>, ? extends java.util.List<com.baymax.demoapp.api.domain_model.HoldingDM>> mapHoldingsListDTO) {
        return null;
    }
    
    private final com.baymax.demoapp.api.domain_model.HoldingDM mapHoldingDTO(com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO input) {
        return null;
    }
}