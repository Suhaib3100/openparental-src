package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.EmptySet;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* compiled from: PathUtils.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u001b\u001a?\u0010\u001c\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010!\u001a6\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010\"\u001aK\u0010#\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010%\u001aB\u0010#\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0001\u001a4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020,2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\r\u00102\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u00103\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a.\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u00104\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a.\u0010;\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010=\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a.\u0010>\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010<\u001a\u0015\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0087\b\u001a-\u0010@\u001a\u00020\u0002*\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0007¢\u0006\u0002\u0010<\u001a6\u0010A\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u001a\u0010\u001f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\u001a\"\u0006\u0012\u0002\b\u00030 H\u0087\b¢\u0006\u0002\u0010B\u001a\r\u0010C\u001a\u000200*\u00020\u0002H\u0087\b\u001a\r\u0010D\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\n\u001a\u0015\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001H\u0087\n\u001a&\u0010G\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010J\u001a\u0002HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a4\u0010N\u001a\u0004\u0018\u0001HK\"\n\b\u0000\u0010K\u0018\u0001*\u00020L*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010M\u001a\r\u0010O\u001a\u00020P*\u00020\u0002H\u0087\b\u001a\r\u0010Q\u001a\u00020R*\u00020\u0002H\u0087\b\u001a.\u0010S\u001a\u000200*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002000.H\u0087\bø\u0001\u0000\u001a0\u0010V\u001a\u0004\u0018\u00010W*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010Y\u001a&\u0010Z\u001a\u00020[*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010\\\u001a(\u0010]\u001a\u0004\u0018\u00010^*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010_\u001a,\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010c\u001a&\u0010d\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\r\u0010e\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010f\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010g\u001a\u00020:*\u00020\u0002H\u0087\b\u001a&\u0010h\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a\u0015\u0010i\u001a\u00020:*\u00020\u00022\u0006\u0010F\u001a\u00020\u0002H\u0087\b\u001a\r\u0010j\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\r\u0010k\u001a\u00020:*\u00020\u0002H\u0087\b\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00020m*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0001H\u0007\u001a.\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u001a\"\u000207H\u0087\b¢\u0006\u0002\u00108\u001a\u001f\u0010n\u001a\u00020\u0002*\u00020\u00022\u0006\u00105\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020:H\u0087\b\u001a&\u0010o\u001a\u00020:*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010I\u001a2\u0010p\u001a\u0002Hq\"\n\b\u0000\u0010q\u0018\u0001*\u00020r*\u00020\u00022\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010s\u001a<\u0010p\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010W0t*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010u\u001a\r\u0010v\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0016\u0010x\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a\u0014\u0010y\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0007\u001a8\u0010z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010X\u001a\u00020\u00012\b\u0010{\u001a\u0004\u0018\u00010W2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020H0\u001a\"\u00020HH\u0087\b¢\u0006\u0002\u0010|\u001a\u0015\u0010}\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020[H\u0087\b\u001a\u0015\u0010~\u001a\u00020\u0002*\u00020\u00022\u0006\u0010{\u001a\u00020^H\u0087\b\u001a\u001b\u0010\u007f\u001a\u00020\u0002*\u00020\u00022\f\u0010{\u001a\b\u0012\u0004\u0012\u00020b0aH\u0087\b\u001a\u000f\u0010\u0080\u0001\u001a\u00020\u0002*\u00030\u0081\u0001H\u0087\b\u001aF\u0010\u0082\u0001\u001a\u0003H\u0083\u0001\"\u0005\b\u0000\u0010\u0083\u0001*\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u00012\u001b\u0010\u0084\u0001\u001a\u0016\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001\u0012\u0005\u0012\u0003H\u0083\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u0086\u0001\u001a3\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020,2\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:H\u0007\u001aJ\u0010\u0087\u0001\u001a\u000200*\u00020\u00022\n\b\u0002\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020:2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.¢\u0006\u0002\b1H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001\u001a0\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u0001*\u00020\u00022\u0014\u00106\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u008d\u00010\u001a\"\u00030\u008d\u0001H\u0007¢\u0006\u0003\u0010\u008e\u0001\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001e\u0010\n\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u001e\u0010\u0010\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"extension", "", "Ljava/nio/file/Path;", "getExtension$annotations", "(Ljava/nio/file/Path;)V", "getExtension", "(Ljava/nio/file/Path;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath$annotations", "getInvariantSeparatorsPath", "invariantSeparatorsPathString", "getInvariantSeparatorsPathString$annotations", "getInvariantSeparatorsPathString", "name", "getName$annotations", "getName", "nameWithoutExtension", "getNameWithoutExtension$annotations", "getNameWithoutExtension", "pathString", "getPathString$annotations", "getPathString", "Path", "path", "base", "subpaths", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "createTempDirectory", "directory", "prefix", "attributes", "Ljava/nio/file/attribute/FileAttribute;", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createTempFile", "suffix", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "fileAttributeViewNotAvailable", "", "attributeViewClass", "Ljava/lang/Class;", "fileVisitor", "Ljava/nio/file/FileVisitor;", "builderAction", "Lkotlin/Function1;", "Lkotlin/io/path/FileVisitorBuilder;", "", "Lkotlin/ExtensionFunctionType;", "absolute", "absolutePathString", "copyTo", "target", "options", "Ljava/nio/file/CopyOption;", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "overwrite", "", "createDirectories", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "createDirectory", "createFile", "createLinkPointingTo", "createParentDirectories", "createSymbolicLinkPointingTo", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "deleteExisting", "deleteIfExists", "div", "other", "exists", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "fileAttributesView", "V", "Ljava/nio/file/attribute/FileAttributeView;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "fileAttributesViewOrNull", "fileSize", "", "fileStore", "Ljava/nio/file/FileStore;", "forEachDirectoryEntry", "glob", "action", "getAttribute", "", "attribute", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "getLastModifiedTime", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "getOwner", "Ljava/nio/file/attribute/UserPrincipal;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "getPosixFilePermissions", "", "Ljava/nio/file/attribute/PosixFilePermission;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "isDirectory", "isExecutable", "isHidden", "isReadable", "isRegularFile", "isSameFileAs", "isSymbolicLink", "isWritable", "listDirectoryEntries", "", "moveTo", "notExists", "readAttributes", "A", "Ljava/nio/file/attribute/BasicFileAttributes;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "readSymbolicLink", "relativeTo", "relativeToOrNull", "relativeToOrSelf", "setAttribute", "value", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "setLastModifiedTime", "setOwner", "setPosixFilePermissions", "toPath", "Ljava/net/URI;", "useDirectoryEntries", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "visitFileTree", "visitor", "maxDepth", "", "followLinks", "walk", "Lkotlin/io/path/PathWalkOption;", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)Lkotlin/sequences/Sequence;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
/* loaded from: classes6.dex */
class v2 extends m1 {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean A0(Path path, LinkOption... linkOptionArr) {
        boolean exists;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縚"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("縛"));
        exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return exists;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void A1(@d5.d Path path, int i5, boolean z5, @d5.d q3.l<? super FileVisitorBuilder, kotlin.m2> lVar) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縜"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("縝"));
        B1(path, G0(lVar), i5, z5);
    }

    @PublishedApi
    @d5.d
    public static final Void B0(@d5.d Path path, @d5.d Class<?> cls) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縞"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("縟"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("縠") + cls + ProtectedSandApp.s("縡") + path + org.apache.commons.io.k.f32026a);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalPathApi
    public static final void B1(@d5.d Path path, @d5.d FileVisitor<Path> fileVisitor, int i5, boolean z5) {
        Set set;
        FileVisitOption fileVisitOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縢"));
        kotlin.jvm.internal.l0.p(fileVisitor, ProtectedSandApp.s("縣"));
        if (z5) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            set = kotlin.collections.p1.f(fileVisitOption);
        } else {
            set = EmptySet.f23181o;
        }
        Files.walkFileTree(path, set, i5, fileVisitor);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <V extends FileAttributeView> V C0(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縤"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("縥"));
        kotlin.jvm.internal.l0.P();
        fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        V v5 = (V) fileAttributeView;
        if (v5 != null) {
            return v5;
        }
        kotlin.jvm.internal.l0.P();
        B0(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void C1(Path path, int i5, boolean z5, q3.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        A1(path, i5, z5, lVar);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <V extends FileAttributeView> V D0(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縦"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("縧"));
        kotlin.jvm.internal.l0.P();
        fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return (V) fileAttributeView;
    }

    public static /* synthetic */ void D1(Path path, FileVisitor fileVisitor, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        B1(path, fileVisitor, i5, z5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final long E0(Path path) throws IOException {
        long size;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縨"));
        size = Files.size(path);
        return size;
    }

    @SinceKotlin(version = "1.7")
    @d5.d
    @ExperimentalPathApi
    public static final Sequence<Path> E1(@d5.d Path path, @d5.d PathWalkOption... pathWalkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縩"));
        kotlin.jvm.internal.l0.p(pathWalkOptionArr, ProtectedSandApp.s("縪"));
        return new PathTreeWalk(path, pathWalkOptionArr);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final FileStore F0(Path path) throws IOException {
        FileStore fileStore;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縫"));
        fileStore = Files.getFileStore(path);
        kotlin.jvm.internal.l0.o(fileStore, ProtectedSandApp.s("縬"));
        return fileStore;
    }

    @SinceKotlin(version = "1.7")
    @d5.d
    @ExperimentalPathApi
    public static final FileVisitor<Path> G0(@d5.d q3.l<? super FileVisitorBuilder, kotlin.m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("縭"));
        FileVisitorBuilderImpl fileVisitorBuilderImpl = new FileVisitorBuilderImpl();
        lVar.N(fileVisitorBuilderImpl);
        return fileVisitorBuilderImpl.e();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void H0(Path path, String str, q3.l<? super Path, kotlin.m2> lVar) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縮"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("縯"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("縰"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            kotlin.jvm.internal.l0.m(newDirectoryStream);
            Iterator it = newDirectoryStream.iterator();
            while (it.hasNext()) {
                lVar.N(it.next());
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newDirectoryStream, th);
                } else if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    static void I0(Path path, String str, q3.l lVar, int i5, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i5 & 1) != 0) {
            str = ProtectedSandApp.s("縱");
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縲"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("縳"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("縴"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            kotlin.jvm.internal.l0.m(newDirectoryStream);
            Iterator it = newDirectoryStream.iterator();
            while (it.hasNext()) {
                lVar.N(it.next());
            }
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newDirectoryStream, th);
                } else if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Object J0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Object attribute;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縵"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("縶"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("縷"));
        attribute = Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return attribute;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        r2 = kotlin.text.h0.o5(r2, org.apache.commons.io.k.f32026a, "");
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String K0(@d5.d java.nio.file.Path r2) {
        /*
            java.lang.String r0 = "縸"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.nio.file.Path r2 = kotlin.io.path.l.a(r2)
            java.lang.String r0 = ""
            if (r2 == 0) goto L21
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L21
            r1 = 46
            java.lang.String r2 = kotlin.text.v.o5(r2, r1, r0)
            if (r2 != 0) goto L20
            goto L21
        L20:
            r0 = r2
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.v2.K0(java.nio.file.Path):java.lang.String");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void L0(Path path) {
    }

    private static final String M0(Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縹"));
        return O0(path);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @SinceKotlin(version = "1.4")
    @InlineOnly
    @ExperimentalPathApi
    public static /* synthetic */ void N0(Path path) {
    }

    @d5.d
    public static final String O0(@d5.d Path path) {
        FileSystem fileSystem;
        String separator;
        String i22;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("縺"));
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        if (kotlin.jvm.internal.l0.g(separator, ProtectedSandApp.s("縻"))) {
            return path.toString();
        }
        String obj = path.toString();
        kotlin.jvm.internal.l0.m(separator);
        i22 = kotlin.text.e0.i2(obj, separator, ProtectedSandApp.s("縼"), false, 4, null);
        return i22;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void P0(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final FileTime Q0(Path path, LinkOption... linkOptionArr) throws IOException {
        FileTime lastModifiedTime;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("總"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("績"));
        lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(lastModifiedTime, ProtectedSandApp.s("縿"));
        return lastModifiedTime;
    }

    @d5.d
    public static final String R0(@d5.d Path path) {
        Path fileName;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繀"));
        fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void S0(Path path) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r3 = kotlin.text.h0.z5(r3, com.flashget.kidsdownloader.ProtectedSandApp.s("繂"), null, 2, null);
     */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T0(@d5.d java.nio.file.Path r3) {
        /*
            java.lang.String r0 = "繁"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            java.nio.file.Path r3 = kotlin.io.path.l.a(r3)
            if (r3 == 0) goto L23
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L23
            java.lang.String r0 = "繂"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r1 = 2
            r2 = 0
            java.lang.String r3 = kotlin.text.v.z5(r3, r0, r2, r1, r2)
            if (r3 != 0) goto L25
        L23:
            java.lang.String r3 = ""
        L25:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.v2.T0(java.nio.file.Path):java.lang.String");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static /* synthetic */ void U0(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final UserPrincipal V0(Path path, LinkOption... linkOptionArr) throws IOException {
        UserPrincipal owner;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繃"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("繄"));
        owner = Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return owner;
    }

    private static final String W0(Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繅"));
        return path.toString();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    public static /* synthetic */ void X0(Path path) {
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Set<PosixFilePermission> Y0(Path path, LinkOption... linkOptionArr) throws IOException {
        Set<PosixFilePermission> posixFilePermissions;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繆"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("繇"));
        posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(posixFilePermissions, ProtectedSandApp.s("繈"));
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean Z0(Path path, LinkOption... linkOptionArr) {
        boolean isDirectory;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繉"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("繊"));
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return isDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean a1(Path path) {
        boolean isExecutable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繋"));
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path b0(String str) {
        Path path;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("繌"));
        path = Paths.get(str, new String[0]);
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("繍"));
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean b1(Path path) throws IOException {
        boolean isHidden;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繎"));
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path c0(String str, String... strArr) {
        Path path;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("繏"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("繐"));
        path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("繑"));
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean c1(Path path) {
        boolean isReadable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繒"));
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path d0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繓"));
        absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.l0.o(absolutePath, ProtectedSandApp.s("織"));
        return absolutePath;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean d1(Path path, LinkOption... linkOptionArr) {
        boolean isRegularFile;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繕"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("繖"));
        isRegularFile = Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return isRegularFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final String e0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繗"));
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean e1(Path path, Path path2) throws IOException {
        boolean isSameFile;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繘"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繙"));
        isSameFile = Files.isSameFile(path, path2);
        return isSameFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path f0(Path path, Path path2, boolean z5) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繚"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繛"));
        if (z5) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("繜"));
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean f1(Path path) {
        boolean isSymbolicLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繝"));
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path g0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path copy;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繞"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繟"));
        kotlin.jvm.internal.l0.p(copyOptionArr, ProtectedSandApp.s("繠"));
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("繡"));
        return copy;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean g1(Path path) {
        boolean isWritable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繢"));
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    static /* synthetic */ Path h0(Path path, Path path2, boolean z5, int i5, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繣"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繤"));
        if (z5) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("繥"));
        return copy;
    }

    @d5.d
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final List<Path> h1(@d5.d Path path, @d5.d String str) throws IOException {
        DirectoryStream newDirectoryStream;
        List<Path> V5;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繦"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("繧"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            kotlin.jvm.internal.l0.m(newDirectoryStream);
            V5 = kotlin.collections.j0.V5(newDirectoryStream);
            kotlin.io.b.a(newDirectoryStream, null);
            return V5;
        } finally {
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path i0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createDirectories;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繨"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("繩"));
        createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createDirectories, ProtectedSandApp.s("繪"));
        return createDirectories;
    }

    public static /* synthetic */ List i1(Path path, String str, int i5, Object obj) throws IOException {
        if ((i5 & 1) != 0) {
            str = ProtectedSandApp.s("繫");
        }
        return h1(path, str);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path j0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createDirectory;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繬"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("繭"));
        createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createDirectory, ProtectedSandApp.s("繮"));
        return createDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path j1(Path path, Path path2, boolean z5) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繯"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繰"));
        if (z5) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("繱"));
        return move;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path k0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createFile;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繲"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("繳"));
        createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createFile, ProtectedSandApp.s("繴"));
        return createFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path k1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path move;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繵"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繶"));
        kotlin.jvm.internal.l0.p(copyOptionArr, ProtectedSandApp.s("繷"));
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("繸"));
        return move;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path l0(Path path, Path path2) throws IOException {
        Path createLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繹"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繺"));
        createLink = Files.createLink(path, path2);
        kotlin.jvm.internal.l0.o(createLink, ProtectedSandApp.s("繻"));
        return createLink;
    }

    static /* synthetic */ Path l1(Path path, Path path2, boolean z5, int i5, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繼"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("繽"));
        if (z5) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("繾"));
        return move;
    }

    @SinceKotlin(version = "1.9")
    @d5.d
    public static final Path m0(@d5.d Path path, @d5.d FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("繿"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纀"));
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                kotlin.jvm.internal.l0.o(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length)), ProtectedSandApp.s("纁"));
            } catch (FileAlreadyExistsException e6) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e6;
                }
            }
        }
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean m1(Path path, LinkOption... linkOptionArr) {
        boolean notExists;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纂"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("纃"));
        notExists = Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return notExists;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path n0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createSymbolicLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纄"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("纅"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纆"));
        createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createSymbolicLink, ProtectedSandApp.s("纇"));
        return createSymbolicLink;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <A extends BasicFileAttributes> A n1(Path path, LinkOption... linkOptionArr) throws IOException {
        BasicFileAttributes readAttributes;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纈"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("纉"));
        kotlin.jvm.internal.l0.P();
        readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        A a6 = (A) readAttributes;
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("纊"));
        return a6;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path o0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempDirectory;
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纋"));
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, ProtectedSandApp.s("續"));
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Map<String, Object> o1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Map<String, Object> readAttributes;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纍"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("纎"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("纏"));
        readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(readAttributes, ProtectedSandApp.s("纐"));
        return readAttributes;
    }

    @d5.d
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path p0(@d5.e Path path, @d5.e String str, @d5.d FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempDirectory;
        Path createTempDirectory2;
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纑"));
        String s5 = ProtectedSandApp.s("纒");
        if (path != null) {
            createTempDirectory2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            kotlin.jvm.internal.l0.o(createTempDirectory2, s5);
            return createTempDirectory2;
        }
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, s5);
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path p1(Path path) throws IOException {
        Path readSymbolicLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纓"));
        readSymbolicLink = Files.readSymbolicLink(path);
        kotlin.jvm.internal.l0.o(readSymbolicLink, ProtectedSandApp.s("纔"));
        return readSymbolicLink;
    }

    static /* synthetic */ Path q0(String str, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        Path createTempDirectory;
        if ((i5 & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纕"));
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, ProtectedSandApp.s("纖"));
        return createTempDirectory;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @d5.d
    public static final Path q1(@d5.d Path path, @d5.d Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纗"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("纘"));
        try {
            return PathRelativizer.f23434a.a(path, path2);
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(e6.getMessage() + ProtectedSandApp.s("纙") + path + ProtectedSandApp.s("纚") + path2, e6);
        }
    }

    public static /* synthetic */ Path r0(Path path, String str, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            str = null;
        }
        return p0(path, str, fileAttributeArr);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path r1(@d5.d Path path, @d5.d Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纛"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("纜"));
        try {
            return PathRelativizer.f23434a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path s0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempFile;
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纝"));
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile, ProtectedSandApp.s("纞"));
        return createTempFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @d5.d
    public static final Path s1(@d5.d Path path, @d5.d Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纟"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("纠"));
        Path r12 = r1(path, path2);
        return r12 == null ? path : r12;
    }

    @d5.d
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final Path t0(@d5.e Path path, @d5.e String str, @d5.e String str2, @d5.d FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempFile;
        Path createTempFile2;
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("纡"));
        String s5 = ProtectedSandApp.s("红");
        if (path != null) {
            createTempFile2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            kotlin.jvm.internal.l0.o(createTempFile2, s5);
            return createTempFile2;
        }
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile, s5);
        return createTempFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path t1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        Path attribute;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纣"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("纤"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("纥"));
        attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(attribute, ProtectedSandApp.s("约"));
        return attribute;
    }

    static /* synthetic */ Path u0(String str, String str2, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        Path createTempFile;
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("级"));
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile, ProtectedSandApp.s("纨"));
        return createTempFile;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path u1(Path path, FileTime fileTime) throws IOException {
        Path lastModifiedTime;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纩"));
        kotlin.jvm.internal.l0.p(fileTime, ProtectedSandApp.s("纪"));
        lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        kotlin.jvm.internal.l0.o(lastModifiedTime, ProtectedSandApp.s("纫"));
        return lastModifiedTime;
    }

    public static /* synthetic */ Path v0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            str = null;
        }
        if ((i5 & 4) != 0) {
            str2 = null;
        }
        return t0(path, str, str2, fileAttributeArr);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path v1(Path path, UserPrincipal userPrincipal) throws IOException {
        Path owner;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纬"));
        kotlin.jvm.internal.l0.p(userPrincipal, ProtectedSandApp.s("纭"));
        owner = Files.setOwner(path, userPrincipal);
        kotlin.jvm.internal.l0.o(owner, ProtectedSandApp.s("纮"));
        return owner;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final void w0(Path path) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纯"));
        Files.delete(path);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path w1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        Path posixFilePermissions;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纰"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("纱"));
        posixFilePermissions = Files.setPosixFilePermissions(path, set);
        kotlin.jvm.internal.l0.o(posixFilePermissions, ProtectedSandApp.s("纲"));
        return posixFilePermissions;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final boolean x0(Path path) throws IOException {
        boolean deleteIfExists;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纳"));
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path x1(URI uri) {
        Path path;
        kotlin.jvm.internal.l0.p(uri, ProtectedSandApp.s("纴"));
        path = Paths.get(uri);
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("纵"));
        return path;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path y0(Path path, String str) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纶"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("纷"));
        resolve = path.resolve(str);
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("纸"));
        return resolve;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final <T> T y1(Path path, String str, q3.l<? super Sequence<? extends Path>, ? extends T> lVar) throws IOException {
        DirectoryStream newDirectoryStream;
        Sequence A1;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纹"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("纺"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("纻"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            kotlin.jvm.internal.l0.m(newDirectoryStream);
            A1 = kotlin.collections.j0.A1(newDirectoryStream);
            T N = lVar.N(A1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newDirectoryStream, th);
                } else if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @InlineOnly
    private static final Path z0(Path path, Path path2) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("纼"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("纽"));
        resolve = path.resolve(path2);
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("纾"));
        return resolve;
    }

    static Object z1(Path path, String str, q3.l lVar, int i5, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        Sequence A1;
        if ((i5 & 1) != 0) {
            str = ProtectedSandApp.s("线");
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("绀"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("绁"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("绂"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            kotlin.jvm.internal.l0.m(newDirectoryStream);
            A1 = kotlin.collections.j0.A1(newDirectoryStream);
            Object N = lVar.N(A1);
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return N;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (kotlin.internal.m.a(1, 1, 0)) {
                    kotlin.io.b.a(newDirectoryStream, th);
                } else if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
    }
}
