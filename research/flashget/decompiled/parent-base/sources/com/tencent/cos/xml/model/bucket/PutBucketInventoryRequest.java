package com.tencent.cos.xml.model.bucket;

import android.text.TextUtils;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.InventoryConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketInventoryRequest extends BucketRequest {
    private static Pattern pattern = Pattern.compile(ProtectedSandApp.s("㛛\u0001"));
    private InventoryConfiguration inventoryConfiguration;

    public PutBucketInventoryRequest(String str) {
        super(str);
        InventoryConfiguration inventoryConfiguration = new InventoryConfiguration();
        this.inventoryConfiguration = inventoryConfiguration;
        inventoryConfiguration.isEnabled = true;
        inventoryConfiguration.f71725id = ProtectedSandApp.s("㛜\u0001");
        inventoryConfiguration.schedule = new InventoryConfiguration.Schedule();
        this.inventoryConfiguration.destination = new InventoryConfiguration.Destination();
        this.inventoryConfiguration.destination.cosBucketDestination = new InventoryConfiguration.COSBucketDestination();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        pattern.matcher(this.inventoryConfiguration.f71725id).find();
        InventoryConfiguration inventoryConfiguration = this.inventoryConfiguration;
        String str = inventoryConfiguration.includedObjectVersions;
        String str2 = inventoryConfiguration.schedule.frequency;
        InventoryConfiguration.COSBucketDestination cOSBucketDestination = inventoryConfiguration.destination.cosBucketDestination;
        String str3 = cOSBucketDestination.bucket;
        String str4 = cOSBucketDestination.format;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛝\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛞\u0001"), null);
        this.queryParameters.put(ProtectedSandApp.s("㛟\u0001"), this.inventoryConfiguration.f71725id);
        return super.getQueryString();
    }

    public void isEnable(boolean z4) {
        this.inventoryConfiguration.isEnabled = z4;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setDestination(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.format = str;
        }
        if (str2 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.accountId = str2;
        }
        if (str3 != null && str4 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.bucket = y.a(ProtectedSandApp.s("㛠\u0001"), str4, ProtectedSandApp.s("㛡\u0001"), str3);
        }
        if (str5 != null) {
            this.inventoryConfiguration.destination.cosBucketDestination.prefix = str5;
        }
        this.inventoryConfiguration.destination.cosBucketDestination.encryption = new InventoryConfiguration.Encryption();
        this.inventoryConfiguration.destination.cosBucketDestination.encryption.sSECOS = "";
    }

    public void setFilter(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.inventoryConfiguration.filter = new InventoryConfiguration.Filter();
        this.inventoryConfiguration.filter.prefix = str;
    }

    public void setIncludedObjectVersions(InventoryConfiguration.IncludedObjectVersions includedObjectVersions) {
        if (includedObjectVersions != null) {
            this.inventoryConfiguration.includedObjectVersions = includedObjectVersions.getDesc();
        }
    }

    public void setInventoryId(String str) {
        this.inventoryConfiguration.f71725id = str;
    }

    public void setOptionalFields(InventoryConfiguration.Field field) {
        if (field != null) {
            InventoryConfiguration inventoryConfiguration = this.inventoryConfiguration;
            if (inventoryConfiguration.optionalFields == null) {
                inventoryConfiguration.optionalFields = new InventoryConfiguration.OptionalFields();
                this.inventoryConfiguration.optionalFields.fields = new HashSet(6);
            }
            this.inventoryConfiguration.optionalFields.fields.add(field.getValue());
        }
    }

    public void setScheduleFrequency(String str) {
        if (str != null) {
            this.inventoryConfiguration.schedule.frequency = str;
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛢\u0001"), XmlBuilder.buildInventoryConfiguration(this.inventoryConfiguration));
    }
}
