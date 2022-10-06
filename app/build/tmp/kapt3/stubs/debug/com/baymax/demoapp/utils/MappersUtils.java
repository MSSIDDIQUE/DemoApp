package com.baymax.demoapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\tH\u0086\b\u00f8\u0001\u0000JB\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\tH\u0086\b\u00f8\u0001\u0000JB\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00050\tH\u0086\b\u00f8\u0001\u0000J@\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0006\b\u0000\u0010\u000f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u000f0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000e0\tH\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0011"}, d2 = {"Lcom/baymax/demoapp/utils/MappersUtils;", "", "()V", "mapList", "", "O", "I", "input", "mapSingle", "Lkotlin/Function1;", "mapNullInputList", "mapNullOutputList", "map", "Lcom/baymax/demoapp/data/Result;", "R", "T", "transform", "app_debug"})
public final class MappersUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.baymax.demoapp.utils.MappersUtils INSTANCE = null;
    
    private MappersUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <I extends java.lang.Object, O extends java.lang.Object>java.util.List<O> mapList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> input, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super I, ? extends O> mapSingle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <I extends java.lang.Object, O extends java.lang.Object>java.util.List<O> mapNullInputList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends I> input, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super I, ? extends O> mapSingle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <I extends java.lang.Object, O extends java.lang.Object>java.util.List<O> mapNullOutputList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends I> input, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super I, ? extends O> mapSingle) {
        return null;
    }
}