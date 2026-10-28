package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.i;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes3.dex */
public class l implements n, j {

    /* renamed from: d, reason: collision with root package name */
    private final String f38733d;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.i f38735f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f38730a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f38731b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f38732c = new Path();

    /* renamed from: e, reason: collision with root package name */
    private final List<n> f38734e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38736a;

        static {
            int[] iArr = new int[i.a.values().length];
            f38736a = iArr;
            try {
                iArr[i.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38736a[i.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38736a[i.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38736a[i.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38736a[i.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(com.airbnb.lottie.model.content.i iVar) {
        this.f38733d = iVar.c();
        this.f38735f = iVar;
    }

    private void a() {
        for (int i4 = 0; i4 < this.f38734e.size(); i4++) {
            this.f38732c.addPath(this.f38734e.get(i4).getPath());
        }
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        this.f38731b.reset();
        this.f38730a.reset();
        for (int size = this.f38734e.size() - 1; size >= 1; size--) {
            n nVar = this.f38734e.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                List<n> j4 = dVar.j();
                for (int size2 = j4.size() - 1; size2 >= 0; size2--) {
                    Path path = j4.get(size2).getPath();
                    path.transform(dVar.k());
                    this.f38731b.addPath(path);
                }
            } else {
                this.f38731b.addPath(nVar.getPath());
            }
        }
        n nVar2 = this.f38734e.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> j5 = dVar2.j();
            for (int i4 = 0; i4 < j5.size(); i4++) {
                Path path2 = j5.get(i4).getPath();
                path2.transform(dVar2.k());
                this.f38730a.addPath(path2);
            }
        } else {
            this.f38730a.set(nVar2.getPath());
        }
        this.f38732c.op(this.f38730a, this.f38731b, op);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < this.f38734e.size(); i4++) {
            this.f38734e.get(i4).b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void g(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof n) {
                this.f38734e.add((n) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38733d;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        this.f38732c.reset();
        if (this.f38735f.d()) {
            return this.f38732c;
        }
        int i4 = a.f38736a[this.f38735f.b().ordinal()];
        if (i4 == 1) {
            a();
        } else if (i4 == 2) {
            d(Path.Op.UNION);
        } else if (i4 == 3) {
            d(Path.Op.REVERSE_DIFFERENCE);
        } else if (i4 == 4) {
            d(Path.Op.INTERSECT);
        } else if (i4 == 5) {
            d(Path.Op.XOR);
        }
        return this.f38732c;
    }
}
