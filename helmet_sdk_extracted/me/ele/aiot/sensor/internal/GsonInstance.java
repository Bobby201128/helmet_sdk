package me.ele.aiot.sensor.internal;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class GsonInstance {

    /* renamed from: a, reason: collision with root package name */
    private static final BooleanDeserializer f62064a;

    /* renamed from: b, reason: collision with root package name */
    private static final ByteArraySerializer f62065b;

    /* renamed from: c, reason: collision with root package name */
    public static final Gson f62066c;

    /* loaded from: classes4.dex */
    public static class BooleanDeserializer implements com.google.gson.h<Boolean> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        BooleanDeserializer() {
        }

        @Override // com.google.gson.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) throws JsonParseException {
            ISurgeon iSurgeon = $surgeonFlag;
            boolean z12 = true;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return (Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, iVar, type, gVar});
            }
            if (((com.google.gson.m) iVar).w()) {
                if (iVar.g() == 0) {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            }
            return Boolean.valueOf(iVar.a());
        }
    }

    /* loaded from: classes4.dex */
    public static class ByteArraySerializer implements com.google.gson.o<byte[]> {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;

        ByteArraySerializer() {
        }

        @Override // com.google.gson.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.i serialize(byte[] bArr, Type type, com.google.gson.n nVar) {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (com.google.gson.i) iSurgeon.surgeon$dispatch("1", new Object[]{this, bArr, type, nVar}) : new com.google.gson.m(l90.a.a(bArr));
        }
    }

    static {
        BooleanDeserializer booleanDeserializer = new BooleanDeserializer();
        f62064a = booleanDeserializer;
        ByteArraySerializer byteArraySerializer = new ByteArraySerializer();
        f62065b = byteArraySerializer;
        f62066c = new com.google.gson.d().d(Boolean.TYPE, booleanDeserializer).d(Boolean.class, booleanDeserializer).d(byte[].class, byteArraySerializer).b();
    }
}
