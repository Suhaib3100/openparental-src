package ib;

import android.content.SharedPreferences;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import hb.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SharedPreferenceSyncResponseCache.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\t\u0010\u0010R$\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, d2 = {"Lib/d;", "Lhb/j;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Lkotlin/k2;", "clear", "()V", "a", "Landroid/content/SharedPreferences;", "", "value", "c", "()J", "f", "(J)V", "currentTime", "d", "elapsedTime", "e", "b", "currentOffset", "kronos-android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final SharedPreferences sharedPreferences;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static final String f74313c = ProtectedSandApp.s("㠜\u0001");

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final String f74314d = ProtectedSandApp.s("㠝\u0001");

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final String f74315e = ProtectedSandApp.s("㠞\u0001");

    /* renamed from: f, reason: collision with root package name */
    @l
    public static final String f74316f = ProtectedSandApp.s("㠟\u0001");

    public d(@l SharedPreferences sharedPreferences) {
        l0.p(sharedPreferences, ProtectedSandApp.s("㠠\u0001"));
        this.sharedPreferences = sharedPreferences;
    }

    @Override // hb.j
    public void a(long j4) {
        this.sharedPreferences.edit().putLong(ProtectedSandApp.s("㠞\u0001"), j4).apply();
    }

    @Override // hb.j
    public void b(long j4) {
        this.sharedPreferences.edit().putLong(ProtectedSandApp.s("㠟\u0001"), j4).apply();
    }

    @Override // hb.j
    public long c() {
        return this.sharedPreferences.getLong(ProtectedSandApp.s("㠝\u0001"), 0L);
    }

    @Override // hb.j
    public void clear() {
        this.sharedPreferences.edit().clear().apply();
    }

    @Override // hb.j
    public long d() {
        return this.sharedPreferences.getLong(ProtectedSandApp.s("㠞\u0001"), 0L);
    }

    @Override // hb.j
    public long e() {
        return this.sharedPreferences.getLong(ProtectedSandApp.s("㠟\u0001"), 0L);
    }

    @Override // hb.j
    public void f(long j4) {
        this.sharedPreferences.edit().putLong(ProtectedSandApp.s("㠝\u0001"), j4).apply();
    }
}
