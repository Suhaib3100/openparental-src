package com.tencent.qcloud.network.sonar.ping;

import com.tencent.qcloud.network.sonar.Sonar;
import com.tencent.qcloud.network.sonar.SonarCallback;

/* loaded from: classes7.dex */
public class PingSonar implements Sonar<PingResult> {
    public SonarCallback.Step<String> stepCallback;
    private final int count = 10;
    private final int size = 56;
    private final int interval = 200;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b8, code lost:
    
        if (com.tencent.qcloud.network.sonar.utils.SonarLog.openLog != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018d, code lost:
    
        if (com.tencent.qcloud.network.sonar.utils.SonarLog.openLog != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        if (com.tencent.qcloud.network.sonar.utils.SonarLog.openLog != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e4, code lost:
    
        if (com.tencent.qcloud.network.sonar.utils.SonarLog.openLog != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.tencent.qcloud.network.sonar.Sonar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qcloud.network.sonar.SonarResult<com.tencent.qcloud.network.sonar.ping.PingResult> start(com.tencent.qcloud.network.sonar.SonarRequest r13) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qcloud.network.sonar.ping.PingSonar.start(com.tencent.qcloud.network.sonar.SonarRequest):com.tencent.qcloud.network.sonar.SonarResult");
    }

    @Override // com.tencent.qcloud.network.sonar.Sonar
    public void stop() {
    }
}
