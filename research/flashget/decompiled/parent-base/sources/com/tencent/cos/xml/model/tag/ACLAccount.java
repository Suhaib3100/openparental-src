package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ACLAccount {
    List<String> idList = new ArrayList();

    public void addAccount(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.idList.add(String.format(ProtectedSandApp.s("䧄\u0001"), str, str2));
    }

    public String getAccount() {
        String s4;
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.idList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("䧅\u0001");
            if (!hasNext) {
                break;
            }
            sb.append(it.next());
            sb.append(s4);
        }
        String sb2 = sb.toString();
        int lastIndexOf = sb2.lastIndexOf(s4);
        if (lastIndexOf > 0) {
            return sb2.substring(0, lastIndexOf);
        }
        return null;
    }

    public void addAccount(String str) {
        addAccount(str, str);
    }
}
