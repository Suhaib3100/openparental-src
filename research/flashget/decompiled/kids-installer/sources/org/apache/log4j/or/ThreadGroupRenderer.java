package org.apache.log4j.or;

import org.apache.log4j.Layout;

/* loaded from: classes6.dex */
public class ThreadGroupRenderer implements ObjectRenderer {
    @Override // org.apache.log4j.or.ObjectRenderer
    public String doRender(Object obj) {
        if (!(obj instanceof ThreadGroup)) {
            try {
                return obj.toString();
            } catch (Exception e6) {
                return e6.toString();
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
        for (int i5 = 0; i5 < activeCount; i5++) {
            stringBuffer.append(Layout.LINE_SEP);
            stringBuffer.append("   Thread=[");
            stringBuffer.append(threadArr[i5].getName());
            stringBuffer.append(",");
            stringBuffer.append(threadArr[i5].getPriority());
            stringBuffer.append(",");
            stringBuffer.append(threadArr[i5].isDaemon());
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
