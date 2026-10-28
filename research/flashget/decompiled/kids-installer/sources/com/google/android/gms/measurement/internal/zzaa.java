package com.google.android.gms.measurement.internal;

import java.util.BitSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
final class zzaa extends zzku {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i5, int i6) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i5));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:492|(1:494)(1:496)|495)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:446|(6:447|448|449|450|451|(1:454)(1:453))|455)|44|(5:283|(10:285|286|287|288|289|(2:(4:291|(1:293)|294|(1:297)(1:296))|298)(1:431)|299|300|(3:302|(4:305|(2:337|338)(2:309|(8:311|(4:314|(2:316|317)(1:319)|318|312)|320|321|(4:324|(3:326|327|328)(1:330)|329|322)|331|332|333)(2:335|336))|334|303)|339)|340)(1:445)|341|(10:344|(3:348|(4:351|(5:353|354|(1:356)(1:360)|357|358)(1:361)|359|349)|362)|363|(3:367|(4:370|(3:375|376|377)|378|368)|381)|382|(3:384|(6:387|(2:389|(3:391|392|393))(1:396)|394|395|393|385)|397)|398|(3:407|(8:410|(1:412)|413|(1:415)|416|(3:418|419|420)(1:422)|421|408)|423)|424|342)|430)|46|47|(3:182|(4:185|(10:187|188|(1:190)(1:280)|191|(9:193|194|195|196|197|198|199|200|(3:(11:202|203|204|205|206|207|208|(3:210|211|212)(1:253)|213|214|(1:217)(1:216))|218|219)(4:259|260|252|219))(1:279)|220|(4:223|(3:241|242|243)(4:225|226|(2:227|(2:229|(1:231)(2:232|233))(1:240))|(3:235|236|237)(1:239))|238|221)|244|245|246)(1:281)|247|183)|282)|49|50|(3:77|(6:80|(9:82|83|84|85|86|87|89|90|(3:(9:92|93|94|95|96|(1:98)(1:155)|99|100|(1:103)(1:102))|104|105)(4:162|163|154|105))(1:180)|106|(2:107|(2:109|(3:145|146|147)(6:111|(2:112|(4:114|(3:116|(1:118)(1:141)|119)(1:142)|120|(1:1)(2:124|(1:126)(2:127|128)))(2:143|144))|(2:133|132)|130|131|132))(0))|148|78)|181)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:500|501))|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(2:2|(2:4|(2:6|7)(1:515))(2:516|517))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:492|(1:494)(1:496)|495)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:446|(6:447|448|449|450|451|(1:454)(1:453))|455)|44|(5:283|(10:285|286|287|288|289|(2:(4:291|(1:293)|294|(1:297)(1:296))|298)(1:431)|299|300|(3:302|(4:305|(2:337|338)(2:309|(8:311|(4:314|(2:316|317)(1:319)|318|312)|320|321|(4:324|(3:326|327|328)(1:330)|329|322)|331|332|333)(2:335|336))|334|303)|339)|340)(1:445)|341|(10:344|(3:348|(4:351|(5:353|354|(1:356)(1:360)|357|358)(1:361)|359|349)|362)|363|(3:367|(4:370|(3:375|376|377)|378|368)|381)|382|(3:384|(6:387|(2:389|(3:391|392|393))(1:396)|394|395|393|385)|397)|398|(3:407|(8:410|(1:412)|413|(1:415)|416|(3:418|419|420)(1:422)|421|408)|423)|424|342)|430)|46|47|(3:182|(4:185|(10:187|188|(1:190)(1:280)|191|(9:193|194|195|196|197|198|199|200|(3:(11:202|203|204|205|206|207|208|(3:210|211|212)(1:253)|213|214|(1:217)(1:216))|218|219)(4:259|260|252|219))(1:279)|220|(4:223|(3:241|242|243)(4:225|226|(2:227|(2:229|(1:231)(2:232|233))(1:240))|(3:235|236|237)(1:239))|238|221)|244|245|246)(1:281)|247|183)|282)|49|50|(3:77|(6:80|(9:82|83|84|85|86|87|89|90|(3:(9:92|93|94|95|96|(1:98)(1:155)|99|100|(1:103)(1:102))|104|105)(4:162|163|154|105))(1:180)|106|(2:107|(2:109|(3:145|146|147)(6:111|(2:112|(4:114|(3:116|(1:118)(1:141)|119)(1:142)|120|(1:1)(2:124|(1:126)(2:127|128)))(2:143|144))|(2:133|132)|130|131|132))(0))|148|78)|181)|52|53|(9:56|57|58|59|60|61|(2:63|64)(1:66)|65|54)|74|75)(2:500|501))|514|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|52|53|(1:54)|74|75|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0a98, code lost:
    
        r0 = r62.zzt.zzaA().zzk();
        r6 = com.google.android.gms.measurement.internal.zzet.zzn(r62.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0aac, code lost:
    
        if (r7.zzj() == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0aae, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0ab8, code lost:
    
        r0.zzc(com.flashget.kidsdownloader.ProtectedSandApp.s("\u2e7f"), r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0ab7, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x098e, code lost:
    
        if (r12 != null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07d0, code lost:
    
        if (r12 != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x033c, code lost:
    
        if (r5 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0260, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0261, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x026a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x026b, code lost:
    
        r17 = r5;
        r18 = r6;
        r19 = r7;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0266, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0267, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x019c, code lost:
    
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e7 A[Catch: SQLiteException -> 0x0260, all -> 0x0b99, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x0260, blocks: (B:40:0x01e1, B:42:0x01e7, B:446:0x01f7, B:447:0x01fc, B:449:0x0206, B:450:0x0216, B:464:0x0225), top: B:39:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01f7 A[Catch: SQLiteException -> 0x0260, all -> 0x0b99, TRY_ENTER, TryCatch #8 {SQLiteException -> 0x0260, blocks: (B:40:0x01e1, B:42:0x01e7, B:446:0x01f7, B:447:0x01fc, B:449:0x0206, B:450:0x0216, B:464:0x0225), top: B:39:0x01e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0890  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List zza(java.lang.String r63, java.util.List r64, java.util.List r65, java.lang.Long r66, java.lang.Long r67) {
        /*
            Method dump skipped, instructions count: 2977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }
}
