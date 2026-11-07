package me.ele.aiot.activityrecognition.nativelib;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class SoModule {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    public String f61831a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f61832b;

    /* renamed from: c, reason: collision with root package name */
    public List<SoFile> f61833c;

    /* renamed from: d, reason: collision with root package name */
    public String f61834d;

    /* renamed from: e, reason: collision with root package name */
    public String f61835e;

    /* renamed from: f, reason: collision with root package name */
    public String f61836f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f61837g;

    /* renamed from: h, reason: collision with root package name */
    public int f61838h = 10;

    /* loaded from: classes4.dex */
    public static class SoFile implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        String soMd5;
        String soNames;

        public SoFile(String str, String str2) {
            this.soNames = str;
            this.soMd5 = str2;
        }

        public boolean equals(Object obj) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "1")) {
                return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SoFile soFile = (SoFile) obj;
            if (this.soNames.equals(soFile.soNames) && this.soMd5.equals(soFile.soMd5)) {
                return true;
            }
            return false;
        }
    }

    public static boolean b(SoModule soModule) {
        List<SoFile> list;
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("1", new Object[]{soModule})).booleanValue();
        }
        if (soModule != null && soModule.f61834d != null && soModule.f61835e != null && soModule.f61836f != null && (list = soModule.f61833c) != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean a() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "4") ? ((Boolean) iSurgeon.surgeon$dispatch("4", new Object[]{this})).booleanValue() : this.f61837g;
    }

    public void c(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, Boolean.valueOf(z12)});
        } else {
            this.f61837g = z12;
        }
    }

    public boolean equals(Object obj) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return ((Boolean) iSurgeon.surgeon$dispatch("2", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SoModule soModule = (SoModule) obj;
        if (this.f61831a.equals(soModule.f61831a) && this.f61832b.equals(soModule.f61832b) && this.f61833c.equals(soModule.f61833c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? ((Integer) iSurgeon.surgeon$dispatch("3", new Object[]{this})).intValue() : this.f61831a.hashCode();
    }
}
