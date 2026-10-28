package net.minidev.json.parser;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: FakeContainerFactory.java */
/* loaded from: classes7.dex */
public class e implements net.minidev.json.parser.a {

    /* renamed from: c, reason: collision with root package name */
    public a f81750c;

    /* renamed from: d, reason: collision with root package name */
    public b f81751d;

    /* compiled from: FakeContainerFactory.java */
    static class a extends AbstractList<Object> {
        a() {
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i4) {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }
    }

    /* compiled from: FakeContainerFactory.java */
    static class b extends AbstractMap<String, Object> {
        b() {
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object put(String str, Object obj) {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, Object>> entrySet() {
            return null;
        }
    }

    @Override // net.minidev.json.parser.a
    public List<Object> a() {
        if (this.f81750c == null) {
            this.f81750c = new a();
        }
        return this.f81750c;
    }

    @Override // net.minidev.json.parser.a
    public Map<String, Object> b() {
        if (this.f81751d == null) {
            this.f81751d = new b();
        }
        return this.f81751d;
    }
}
