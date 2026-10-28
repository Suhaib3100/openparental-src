package androidx.core.os;

import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Profiling.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Landroidx/core/os/a;", "", "", "value", "<init>", "(I)V", "a", "I", "()I", "b", "c", "Landroidx/core/os/a$b;", "Landroidx/core/os/a$c;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(api = 35)
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final a f26489c = new b();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final a f26490d = new c();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: Profiling.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/a$b;", "Landroidx/core/os/a;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends a {
        public b() {
            super(1, null);
        }
    }

    /* compiled from: Profiling.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/a$c;", "Landroidx/core/os/a;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends a {
        public c() {
            super(2, null);
        }
    }

    public /* synthetic */ a(int i4, kotlin.jvm.internal.w wVar) {
        this(i4);
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    private a(int i4) {
        this.value = i4;
    }
}
