package org.apache.log4j.or;

import org.apache.log4j.Layout;

/* loaded from: classes3.dex */
public class ThreadGroupRenderer implements ObjectRenderer {
    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        if (!(obj instanceof ThreadGroup)) {
            try {
                return obj.toString();
            } catch (Exception e4) {
                return e4.toString();
            }
        }
        StringBuffer stringBuffer = new StringBuffer("java.lang.ThreadGroup[name=");
        ThreadGroup threadGroup = (ThreadGroup) obj;
        stringBuffer.append(threadGroup.getName());
        stringBuffer.append(", maxpri=");
        stringBuffer.append(threadGroup.getMaxPriority());
        stringBuffer.append("]");
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[activeCount];
        threadGroup.enumerate(threadArr);
        for (int i4 = 0; i4 < activeCount; i4++) {
            stringBuffer.append(Layout.LINE_SEP);
            stringBuffer.append("   Thread=[");
            stringBuffer.append(threadArr[i4].getName());
            stringBuffer.append(",");
            stringBuffer.append(threadArr[i4].getPriority());
            stringBuffer.append(",");
            stringBuffer.append(threadArr[i4].isDaemon());
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
