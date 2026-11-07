package me.ele.aiot.indoorguide.cache;

import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.Param;
import com.taobao.mrt.task.MRTRuntimeException;
import e00.a;

/* loaded from: classes4.dex */
public final class FileDownloader$2 implements DownloadListener {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    final /* synthetic */ a.InterfaceC0713a val$callback;

    FileDownloader$2(a.InterfaceC0713a interfaceC0713a) {
        this.val$callback = interfaceC0713a;
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onDownloadError(String str, int i12, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, str, Integer.valueOf(i12), str2});
            return;
        }
        a.InterfaceC0713a interfaceC0713a = this.val$callback;
        if (interfaceC0713a != null) {
            interfaceC0713a.onCompletion(false, new MRTRuntimeException(i12, str2), null);
        }
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onDownloadFinish(String str, String str2) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "3")) {
            iSurgeon.surgeon$dispatch("3", new Object[]{this, str, str2});
            return;
        }
        a.InterfaceC0713a interfaceC0713a = this.val$callback;
        if (interfaceC0713a != null) {
            interfaceC0713a.onCompletion(true, null, str2);
        }
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onDownloadProgress(int i12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "1")) {
            iSurgeon.surgeon$dispatch("1", new Object[]{this, Integer.valueOf(i12)});
        }
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onDownloadStateChange(String str, boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, str, Boolean.valueOf(z12)});
        }
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onFinish(boolean z12) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            iSurgeon.surgeon$dispatch("5", new Object[]{this, Boolean.valueOf(z12)});
        }
    }

    @Override // com.taobao.downloader.request.DownloadListener
    public void onNetworkLimit(int i12, Param param, DownloadListener.a aVar) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "6")) {
            iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12), param, aVar});
        }
    }
}
