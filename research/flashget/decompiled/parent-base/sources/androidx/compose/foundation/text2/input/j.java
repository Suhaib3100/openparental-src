package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: InputTransformation.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text2/input/h;", "next", "b", "(Landroidx/compose/foundation/text2/input/h;Landroidx/compose/foundation/text2/input/h;)Landroidx/compose/foundation/text2/input/h;", "a", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {
    @x4
    @fg.l
    @z0
    public static final h a(@fg.l h hVar, @fg.l h hVar2) {
        return new f(hVar, hVar2);
    }

    @z0
    @x4
    @fg.m
    @kd.i(name = "thenOrNull")
    public static final h b(@fg.m h hVar, @fg.m h hVar2) {
        return hVar == null ? hVar2 : hVar2 == null ? hVar : new f(hVar, hVar2);
    }
}
