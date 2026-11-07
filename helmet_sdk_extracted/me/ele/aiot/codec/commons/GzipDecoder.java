package me.ele.aiot.codec.commons;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public class GzipDecoder {
    private static transient /* synthetic */ ISurgeon $surgeonFlag = null;
    private static final int BUFFER_SIZE = 1024;

    private GzipDecoder() {
    }

    public static byte[] decode(byte[] bArr) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            return (byte[]) iSurgeon.surgeon$dispatch("1", new Object[]{bArr});
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr2);
                            if (read > 0) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                byteArrayOutputStream.close();
                                return byteArray;
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e12) {
            throw new CodecException("gzip解压错误", e12);
        }
    }
}
