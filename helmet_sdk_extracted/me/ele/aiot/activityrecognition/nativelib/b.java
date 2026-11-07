package me.ele.aiot.activityrecognition.nativelib;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class b {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;

    /* renamed from: a, reason: collision with root package name */
    protected static char[] f61841a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static void a(byte b12, StringBuffer stringBuffer) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
            iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{Byte.valueOf(b12), stringBuffer});
            return;
        }
        char[] cArr = f61841a;
        char c12 = cArr[(b12 & 240) >> 4];
        char c13 = cArr[b12 & 15];
        stringBuffer.append(c12);
        stringBuffer.append(c13);
    }

    private static String b(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "6") ? (String) iSurgeon.surgeon$dispatch("6", new Object[]{bArr}) : c(bArr, 0, bArr.length);
    }

    private static String c(byte[] bArr, int i12, int i13) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "7")) {
            return (String) iSurgeon.surgeon$dispatch("7", new Object[]{bArr, Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        StringBuffer stringBuffer = new StringBuffer(i13 * 2);
        int i14 = i13 + i12;
        while (i12 < i14) {
            a(bArr[i12], stringBuffer);
            i12++;
        }
        return stringBuffer.toString();
    }

    public static String d(File file) throws FileNotFoundException {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            return (String) iSurgeon.surgeon$dispatch("3", new Object[]{file});
        }
        if (file.isFile()) {
            return e(new FileInputStream(file));
        }
        return null;
    }

    public static String e(InputStream inputStream) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            return (String) iSurgeon.surgeon$dispatch("4", new Object[]{inputStream});
        }
        MessageDigest messageDigest = null;
        byte[] bArr = new byte[1024];
        try {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        } catch (IOException | NoSuchAlgorithmException e12) {
            e12.printStackTrace();
        }
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                messageDigest.update(bArr, 0, read);
            }
            try {
                break;
            } catch (IOException unused2) {
                return b(messageDigest.digest());
            }
        }
        inputStream.close();
    }

    public static String f(String str) {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (String) iSurgeon.surgeon$dispatch("1", new Object[]{str}) : g(str.getBytes());
    }

    public static String g(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            return (String) iSurgeon.surgeon$dispatch("2", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e12) {
            e12.printStackTrace();
            return null;
        }
    }
}
