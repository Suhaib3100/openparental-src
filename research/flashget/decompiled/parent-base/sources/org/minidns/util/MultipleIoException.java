package org.minidns.util;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class MultipleIoException extends IOException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f87559c = -5932211337552319515L;

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f87560d = false;

    /* renamed from: b, reason: collision with root package name */
    private final List<IOException> f87561b;

    private MultipleIoException(List<? extends IOException> list) {
        super(b(list));
        this.f87561b = Collections.unmodifiableList(list);
    }

    private static String b(Collection<? extends Exception> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<? extends Exception> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMessage());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static void c(List<? extends IOException> list) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new MultipleIoException(list);
        }
        throw list.get(0);
    }

    public static IOException d(List<? extends IOException> list) {
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size > 1) {
            return new MultipleIoException(list);
        }
        return null;
    }

    public List<IOException> a() {
        return this.f87561b;
    }
}
