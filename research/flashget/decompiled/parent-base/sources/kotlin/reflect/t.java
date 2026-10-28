package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: KTypeParameter.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/t;", "Lkotlin/reflect/g;", "", "getName", "()Ljava/lang/String;", "name", "", "Lkotlin/reflect/s;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "Lkotlin/reflect/v;", "o", "()Lkotlin/reflect/v;", "variance", "", "l", "()Z", "isReified", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface t extends g {
    @fg.l
    String getName();

    @fg.l
    List<s> getUpperBounds();

    boolean l();

    @fg.l
    v o();
}
