package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.style.k;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0013\u0010&\u001a\u00020%ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001aJ\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0017J\u0013\u0010-\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0017R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/platform/j1;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/style/a;", "b", "()F", "Landroidx/compose/ui/text/style/o;", "n", "()Landroidx/compose/ui/text/style/o;", "Landroidx/compose/ui/text/style/k;", "m", "()Landroidx/compose/ui/text/style/k;", "Landroidx/compose/ui/graphics/c6;", "j", "()Landroidx/compose/ui/graphics/c6;", "", "c", "()B", "", "i", "()I", "Lkotlin/a2;", "p", "()J", "", "e", "l", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/i0;", "k", "()Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/graphics/d2;", "d", "Landroidx/compose/ui/unit/z;", "o", "Landroidx/compose/ui/text/font/o0;", "h", "()Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "f", "Landroidx/compose/ui/text/font/l0;", "g", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f19950b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Parcel parcel;

    public j1(@fg.l String str) {
        Parcel obtain = Parcel.obtain();
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.parcel.dataAvail();
    }

    private final float b() {
        return androidx.compose.ui.text.style.a.e(this.parcel.readFloat());
    }

    private final byte c() {
        return this.parcel.readByte();
    }

    private final float e() {
        return this.parcel.readFloat();
    }

    private final int i() {
        return this.parcel.readInt();
    }

    private final androidx.compose.ui.graphics.c6 j() {
        return new androidx.compose.ui.graphics.c6(d(), i0.g.a(this.parcel.readFloat(), this.parcel.readFloat()), this.parcel.readFloat(), null);
    }

    private final String l() {
        return this.parcel.readString();
    }

    private final androidx.compose.ui.text.style.k m() {
        int readInt = this.parcel.readInt();
        k.Companion companion = androidx.compose.ui.text.style.k.INSTANCE;
        companion.getClass();
        boolean z4 = (androidx.compose.ui.text.style.k.f21366f.getMask() & readInt) != 0;
        companion.getClass();
        boolean z5 = (readInt & androidx.compose.ui.text.style.k.f21365e.getMask()) != 0;
        if (z4 && z5) {
            companion.getClass();
            androidx.compose.ui.text.style.k kVar = androidx.compose.ui.text.style.k.f21366f;
            companion.getClass();
            return companion.a(kotlin.collections.w.O(kVar, androidx.compose.ui.text.style.k.f21365e));
        }
        if (z4) {
            companion.getClass();
            return androidx.compose.ui.text.style.k.f21366f;
        }
        if (z5) {
            companion.getClass();
            return androidx.compose.ui.text.style.k.f21365e;
        }
        companion.getClass();
        return androidx.compose.ui.text.style.k.f21364d;
    }

    private final androidx.compose.ui.text.style.o n() {
        return new androidx.compose.ui.text.style.o(this.parcel.readFloat(), this.parcel.readFloat());
    }

    private final long p() {
        return kotlin.a2.h(this.parcel.readLong());
    }

    public final long d() {
        return androidx.compose.ui.graphics.d2.t(p());
    }

    public final int f() {
        byte readByte = this.parcel.readByte();
        if (readByte == 0) {
            androidx.compose.ui.text.font.k0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.k0.f20754c;
        }
        if (readByte == 1) {
            androidx.compose.ui.text.font.k0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.k0.f20755d;
        }
        androidx.compose.ui.text.font.k0.INSTANCE.getClass();
        return androidx.compose.ui.text.font.k0.f20754c;
    }

    public final int g() {
        byte readByte = this.parcel.readByte();
        if (readByte == 0) {
            androidx.compose.ui.text.font.l0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.l0.f20759c;
        }
        if (readByte == 1) {
            androidx.compose.ui.text.font.l0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.l0.f20760d;
        }
        if (readByte == 3) {
            androidx.compose.ui.text.font.l0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.l0.f20762f;
        }
        if (readByte == 2) {
            androidx.compose.ui.text.font.l0.INSTANCE.getClass();
            return androidx.compose.ui.text.font.l0.f20761e;
        }
        androidx.compose.ui.text.font.l0.INSTANCE.getClass();
        return androidx.compose.ui.text.font.l0.f20759c;
    }

    @fg.l
    public final androidx.compose.ui.text.font.o0 h() {
        return new androidx.compose.ui.text.font.o0(this.parcel.readInt());
    }

    @fg.l
    public final androidx.compose.ui.text.i0 k() {
        h2 h2Var;
        h2 h2Var2 = r15;
        h2 h2Var3 = new h2(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte readByte = this.parcel.readByte();
            if (readByte != 1) {
                h2Var = h2Var2;
                if (readByte == 2) {
                    if (this.parcel.dataAvail() < 5) {
                        break;
                    }
                    h2Var.t(o());
                    h2Var2 = h2Var;
                } else if (readByte == 3) {
                    if (this.parcel.dataAvail() < 4) {
                        break;
                    }
                    h2Var.w(h());
                    h2Var2 = h2Var;
                } else if (readByte == 4) {
                    if (this.parcel.dataAvail() < 1) {
                        break;
                    }
                    h2Var.u(androidx.compose.ui.text.font.k0.c(f()));
                    h2Var2 = h2Var;
                } else if (readByte != 5) {
                    if (readByte != 6) {
                        if (readByte != 7) {
                            if (readByte != 8) {
                                if (readByte != 9) {
                                    if (readByte != 10) {
                                        if (readByte != 11) {
                                            if (readByte == 12) {
                                                if (this.parcel.dataAvail() < 20) {
                                                    break;
                                                }
                                                h2Var.z(j());
                                            }
                                        } else {
                                            if (this.parcel.dataAvail() < 4) {
                                                break;
                                            }
                                            h2Var.A(m());
                                        }
                                    } else {
                                        if (this.parcel.dataAvail() < 8) {
                                            break;
                                        }
                                        h2Var.o(d());
                                    }
                                } else {
                                    if (this.parcel.dataAvail() < 8) {
                                        break;
                                    }
                                    h2Var.B(n());
                                }
                            } else {
                                if (this.parcel.dataAvail() < 4) {
                                    break;
                                }
                                h2Var.p(androidx.compose.ui.text.style.a.d(b()));
                            }
                        } else {
                            if (this.parcel.dataAvail() < 5) {
                                break;
                            }
                            h2Var.x(o());
                        }
                    } else {
                        h2Var.s(this.parcel.readString());
                    }
                    h2Var2 = h2Var;
                } else {
                    if (this.parcel.dataAvail() < 1) {
                        break;
                    }
                    h2Var.v(androidx.compose.ui.text.font.l0.e(g()));
                    h2Var2 = h2Var;
                }
            } else {
                if (this.parcel.dataAvail() < 8) {
                    break;
                }
                h2Var2.q(d());
            }
        }
        h2Var = h2Var2;
        return h2Var.C();
    }

    public final long o() {
        long j4;
        byte readByte = this.parcel.readByte();
        if (readByte == 1) {
            androidx.compose.ui.unit.b0.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.b0.f21487d;
        } else if (readByte == 2) {
            androidx.compose.ui.unit.b0.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.b0.f21488e;
        } else {
            androidx.compose.ui.unit.b0.INSTANCE.getClass();
            j4 = androidx.compose.ui.unit.b0.f21486c;
        }
        androidx.compose.ui.unit.b0.INSTANCE.getClass();
        if (!androidx.compose.ui.unit.b0.g(j4, androidx.compose.ui.unit.b0.f21486c)) {
            return androidx.compose.ui.unit.a0.v(j4, this.parcel.readFloat());
        }
        androidx.compose.ui.unit.z.INSTANCE.getClass();
        return androidx.compose.ui.unit.z.f21534d;
    }
}
