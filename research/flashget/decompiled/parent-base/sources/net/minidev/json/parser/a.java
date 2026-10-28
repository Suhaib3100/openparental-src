package net.minidev.json.parser;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ContainerFactory.java */
/* loaded from: classes7.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f81743a = new C1276a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f81744b = new b();

    /* compiled from: ContainerFactory.java */
    /* renamed from: net.minidev.json.parser.a$a, reason: collision with other inner class name */
    static class C1276a implements a {
        C1276a() {
        }

        @Override // net.minidev.json.parser.a
        public List<Object> a() {
            return new net.minidev.json.a();
        }

        @Override // net.minidev.json.parser.a
        public Map<String, Object> b() {
            return new net.minidev.json.e();
        }
    }

    /* compiled from: ContainerFactory.java */
    static class b implements a {
        b() {
        }

        @Override // net.minidev.json.parser.a
        public List<Object> a() {
            return new net.minidev.json.a();
        }

        @Override // net.minidev.json.parser.a
        public Map<String, Object> b() {
            return new LinkedHashMap();
        }
    }

    List<Object> a();

    Map<String, Object> b();
}
