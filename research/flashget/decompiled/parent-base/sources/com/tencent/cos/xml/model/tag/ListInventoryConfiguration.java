package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;

/* loaded from: classes7.dex */
public class ListInventoryConfiguration {
    public String continuationToken;
    public Set<InventoryConfiguration> inventoryConfigurations;
    public boolean isTruncated = false;
    public String nextContinuationToken;

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䫒\u0001"));
        sb.append(this.isTruncated);
        String s4 = ProtectedSandApp.s("䫓\u0001");
        sb.append(s4);
        if (this.continuationToken != null) {
            sb.append(ProtectedSandApp.s("䫔\u0001"));
            sb.append(this.continuationToken);
            sb.append(s4);
        }
        if (this.nextContinuationToken != null) {
            sb.append(ProtectedSandApp.s("䫕\u0001"));
            sb.append(this.nextContinuationToken);
            sb.append(s4);
        }
        Set<InventoryConfiguration> set = this.inventoryConfigurations;
        if (set != null) {
            for (InventoryConfiguration inventoryConfiguration : set) {
                if (inventoryConfiguration != null) {
                    sb.append(inventoryConfiguration.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䫖\u0001"));
        return sb.toString();
    }
}
