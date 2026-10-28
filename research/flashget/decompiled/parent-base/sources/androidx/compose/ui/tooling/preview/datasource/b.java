package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.sequences.p;
import v0.h;

/* compiled from: LoremIpsum.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/b;", "Lv0/h;", "", "", "words", "<init>", "(I)V", "()V", "b", "(I)Ljava/lang/String;", "a", "I", "Lkotlin/sequences/m;", "K", "()Lkotlin/sequences/m;", "values", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class b implements h<String> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f21449b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int words;

    /* compiled from: LoremIpsum.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.f f21451b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21452c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.f fVar, int i4) {
            super(0);
            this.f21451b = fVar;
            this.f21452c = i4;
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            List list;
            list = c.f21453a;
            k1.f fVar = this.f21451b;
            int i4 = fVar.f75327b;
            fVar.f75327b = i4 + 1;
            return (String) list.get(i4 % this.f21452c);
        }
    }

    public b(int i4) {
        this.words = i4;
    }

    private final String b(int words) {
        List list;
        k1.f fVar = new k1.f();
        list = c.f21453a;
        return p.e1(p.Y2(p.m(new a(fVar, list.size())), words), " ", null, null, 0, null, null, 62, null);
    }

    @Override // v0.h
    @l
    public kotlin.sequences.m<String> K() {
        return p.q(b(this.words));
    }

    public b() {
        this(500);
    }
}
