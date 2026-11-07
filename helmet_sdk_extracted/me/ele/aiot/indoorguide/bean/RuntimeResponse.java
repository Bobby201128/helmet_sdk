package me.ele.aiot.indoorguide.bean;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.alibaba.surgeon.bridge.ISurgeon;
import com.alibaba.surgeon.instrument.InstrumentAPI;
import java.io.Serializable;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes4.dex */
public class RuntimeResponse implements Serializable {
    private static transient /* synthetic */ ISurgeon $surgeonFlag;
    private ConfigBean config;
    private ThingModelBean thingModel;

    /* loaded from: classes4.dex */
    public static class ConfigBean implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private int cacheMaxLogCount;
        private int cityId;
        private boolean enable;
        private int orientationRefreshInterval;
        private int uploadLogCount;
        private int uploadLogInterval;
        private boolean useNewUploadLogic;
        private int version;

        public int getCacheMaxLogCount() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "11") ? ((Integer) iSurgeon.surgeon$dispatch("11", new Object[]{this})).intValue() : this.cacheMaxLogCount;
        }

        public int getCityId() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? ((Integer) iSurgeon.surgeon$dispatch("1", new Object[]{this})).intValue() : this.cityId;
        }

        public int getOrientationRefreshInterval() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "15") ? ((Integer) iSurgeon.surgeon$dispatch("15", new Object[]{this})).intValue() : this.orientationRefreshInterval;
        }

        public int getUploadLogCount() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "9") ? ((Integer) iSurgeon.surgeon$dispatch("9", new Object[]{this})).intValue() : this.uploadLogCount;
        }

        public int getUploadLogInterval() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "13") ? ((Integer) iSurgeon.surgeon$dispatch("13", new Object[]{this})).intValue() : this.uploadLogInterval;
        }

        public int getVersion() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.version;
        }

        public boolean isEnable() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? ((Boolean) iSurgeon.surgeon$dispatch("3", new Object[]{this})).booleanValue() : this.enable;
        }

        public boolean isUseNewUploadLogic() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "7") ? ((Boolean) iSurgeon.surgeon$dispatch("7", new Object[]{this})).booleanValue() : this.useNewUploadLogic;
        }

        public void setCacheMaxLogCount(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "12")) {
                iSurgeon.surgeon$dispatch("12", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.cacheMaxLogCount = i12;
            }
        }

        public void setCityId(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.cityId = i12;
            }
        }

        public void setEnable(boolean z12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, Boolean.valueOf(z12)});
            } else {
                this.enable = z12;
            }
        }

        public void setOrientationRefreshInterval(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "16")) {
                iSurgeon.surgeon$dispatch("16", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.orientationRefreshInterval = i12;
            }
        }

        public void setUploadLogCount(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, AgooConstants.ACK_REMOVE_PACKAGE)) {
                iSurgeon.surgeon$dispatch(AgooConstants.ACK_REMOVE_PACKAGE, new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.uploadLogCount = i12;
            }
        }

        public void setUploadLogInterval(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "14")) {
                iSurgeon.surgeon$dispatch("14", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.uploadLogInterval = i12;
            }
        }

        public void setUseNewUploadLogic(boolean z12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, PrepareException.ERROR_AUTH_FAIL)) {
                iSurgeon.surgeon$dispatch(PrepareException.ERROR_AUTH_FAIL, new Object[]{this, Boolean.valueOf(z12)});
            } else {
                this.useNewUploadLogic = z12;
            }
        }

        public void setVersion(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.version = i12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "17")) {
                return (String) iSurgeon.surgeon$dispatch("17", new Object[]{this});
            }
            return "ConfigBean{cityId=" + this.cityId + ", enable=" + this.enable + ", version=" + this.version + ", useNewUploadLogic='" + this.useNewUploadLogic + "', uploadLogCount=" + this.uploadLogCount + ", cacheMaxLogCount=" + this.cacheMaxLogCount + ", uploadLogInterval=" + this.uploadLogInterval + ", orientationRefreshInterval=" + this.orientationRefreshInterval + '}';
        }
    }

    /* loaded from: classes4.dex */
    public static class ThingModelBean implements Serializable {
        private static transient /* synthetic */ ISurgeon $surgeonFlag;
        private List<?> events;
        private List<?> properties;
        private int version;

        public List<?> getEvents() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "1") ? (List) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.events;
        }

        public List<?> getProperties() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "3") ? (List) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.properties;
        }

        public int getVersion() {
            ISurgeon iSurgeon = $surgeonFlag;
            return InstrumentAPI.support(iSurgeon, "5") ? ((Integer) iSurgeon.surgeon$dispatch("5", new Object[]{this})).intValue() : this.version;
        }

        public void setEvents(List<?> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "2")) {
                iSurgeon.surgeon$dispatch("2", new Object[]{this, list});
            } else {
                this.events = list;
            }
        }

        public void setProperties(List<?> list) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "4")) {
                iSurgeon.surgeon$dispatch("4", new Object[]{this, list});
            } else {
                this.properties = list;
            }
        }

        public void setVersion(int i12) {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "6")) {
                iSurgeon.surgeon$dispatch("6", new Object[]{this, Integer.valueOf(i12)});
            } else {
                this.version = i12;
            }
        }

        public String toString() {
            ISurgeon iSurgeon = $surgeonFlag;
            if (InstrumentAPI.support(iSurgeon, "7")) {
                return (String) iSurgeon.surgeon$dispatch("7", new Object[]{this});
            }
            return "ThingModelBean{events=" + this.events + ", properties=" + this.properties + ", version=" + this.version + '}';
        }
    }

    public ConfigBean getConfig() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "1") ? (ConfigBean) iSurgeon.surgeon$dispatch("1", new Object[]{this}) : this.config;
    }

    public ThingModelBean getThingModel() {
        ISurgeon iSurgeon = $surgeonFlag;
        return InstrumentAPI.support(iSurgeon, "3") ? (ThingModelBean) iSurgeon.surgeon$dispatch("3", new Object[]{this}) : this.thingModel;
    }

    public void setConfig(ConfigBean configBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "2")) {
            iSurgeon.surgeon$dispatch("2", new Object[]{this, configBean});
        } else {
            this.config = configBean;
        }
    }

    public void setThingModel(ThingModelBean thingModelBean) {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "4")) {
            iSurgeon.surgeon$dispatch("4", new Object[]{this, thingModelBean});
        } else {
            this.thingModel = thingModelBean;
        }
    }

    public String toString() {
        ISurgeon iSurgeon = $surgeonFlag;
        if (InstrumentAPI.support(iSurgeon, "5")) {
            return (String) iSurgeon.surgeon$dispatch("5", new Object[]{this});
        }
        return "RuntimeResponse{config=" + this.config + ", thingModel=" + this.thingModel + '}';
    }
}
