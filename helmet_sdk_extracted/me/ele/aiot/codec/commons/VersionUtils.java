package me.ele.aiot.codec.commons;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;

/* loaded from: classes4.dex */
public final class VersionUtils {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    private VersionUtils() {
    }

    public static byte[] compose(int i12, byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (byte[]) iSurgeon.surgeon$dispatch("3", new Object[]{Integer.valueOf(i12), bArr});
        }
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = (byte) i12;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return bArr2;
    }

    public static byte[] getData(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (byte[]) iSurgeon.surgeon$dispatch("2", new Object[]{bArr});
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, length);
        return bArr2;
    }

    public static int getVersion(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{bArr})).intValue() : bArr[0];
    }
}
