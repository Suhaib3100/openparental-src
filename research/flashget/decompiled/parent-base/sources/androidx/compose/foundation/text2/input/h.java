package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: InputTransformation.kt */
@x4
@z0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/h;", "", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "Landroidx/compose/foundation/text/f0;", "b", "()Landroidx/compose/foundation/text/f0;", "keyboardOptions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f8521a;

    /* compiled from: InputTransformation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u00020\u000b26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text2/input/h$a;", "", "<init>", "()V", "Lkotlin/Function2;", "", "Lkotlin/r0;", "name", "current", "proposed", "transformation", "Landroidx/compose/foundation/text2/input/h;", "a", "(Lld/p;)Landroidx/compose/foundation/text2/input/h;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8521a = new Companion();

        private Companion() {
        }

        @x4
        @fg.l
        @z0
        public final h a(@fg.l ld.p<? super CharSequence, ? super CharSequence, ? extends CharSequence> transformation) {
            return new i(transformation);
        }
    }

    void a(@fg.l q originalValue, @fg.l o valueWithChanges);

    @fg.m
    default f0 b() {
        return null;
    }
}
