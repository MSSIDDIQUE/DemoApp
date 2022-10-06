package com.baymax.demoapp.api.data_trasfeer_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/baymax/demoapp/api/data_trasfeer_model/ApiResponseDTO;", "", "clientId", "", "holdingsDTOS", "", "Lcom/baymax/demoapp/api/data_trasfeer_model/HoldingDTO;", "error", "responseType", "timestamp", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getClientId", "()Ljava/lang/String;", "getError", "getHoldingsDTOS", "()Ljava/util/List;", "getResponseType", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/baymax/demoapp/api/data_trasfeer_model/ApiResponseDTO;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class ApiResponseDTO {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "client_id")
    private final java.lang.String clientId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> holdingsDTOS = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error")
    private final java.lang.String error = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "response_type")
    private final java.lang.String responseType = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private final java.lang.Long timestamp = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.baymax.demoapp.api.data_trasfeer_model.ApiResponseDTO copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clientId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> holdingsDTOS, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.lang.String responseType, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ApiResponseDTO(@org.jetbrains.annotations.Nullable()
    java.lang.String clientId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> holdingsDTOS, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.lang.String responseType, @org.jetbrains.annotations.Nullable()
    java.lang.Long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.baymax.demoapp.api.data_trasfeer_model.HoldingDTO> getHoldingsDTOS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponseType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimestamp() {
        return null;
    }
}