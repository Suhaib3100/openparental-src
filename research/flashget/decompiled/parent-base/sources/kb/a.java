package kb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Dns.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkb/a;", "", "", "host", "", "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)[Ljava/net/InetAddress;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u0012\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkb/a$a;", "Lkb/a;", "<init>", "()V", "", "host", "", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;)[Ljava/net/InetAddress;", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nDns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dns.kt\ncom/lyft/kronos/sntp/Dns$Impl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,21:1\n18#2:22\n26#3:23\n26#3:24\n26#3:25\n*S KotlinDebug\n*F\n+ 1 Dns.kt\ncom/lyft/kronos/sntp/Dns$Impl\n*L\n13#1:22\n13#1:23\n15#1:24\n17#1:25\n*E\n"})
    /* renamed from: kb.a$a, reason: collision with other inner class name */
    public static final class C1043a implements a {
        @Override // kb.a
        @l
        public InetAddress[] a(@l String host) {
            l0.p(host, ProtectedSandApp.s("㡍\u0001"));
            try {
                InetAddress[] allByName = InetAddress.getAllByName(host);
                return allByName == null ? new InetAddress[0] : allByName;
            } catch (SecurityException unused) {
                return new InetAddress[0];
            } catch (UnknownHostException unused2) {
                return new InetAddress[0];
            }
        }
    }

    @l
    InetAddress[] a(@l String host);
}
