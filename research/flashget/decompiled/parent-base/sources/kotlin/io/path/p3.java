package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: PathUtils.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\b\u001a&\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a0\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\f*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0018\u001a\u00020\f*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a(\u0010\u0019\u001a\u00020\f*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0017\u001a(\u0010\u001a\u001a\u00020\f*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0014\u0010\u001f\u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001f\u0010\u001c\u001a\u0014\u0010 \u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b \u0010\u001c\u001a\u001c\u0010\"\u001a\u00020\f*\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\"\u0010#\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000%*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0003H\u0007¢\u0006\u0004\b&\u0010'\u001aA\u0010,\u001a\u00028\u0000\"\u0004\b\u0000\u0010(*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00032\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000*\u0012\u0004\u0012\u00028\u00000)H\u0087\bø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a5\u00100\u001a\u00020.*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00032\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020.0)H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u0014\u00103\u001a\u000202*\u00020\u0000H\u0087\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00105\u001a\u00020.*\u00020\u0000H\u0087\b¢\u0006\u0004\b5\u00106\u001a\u0014\u00107\u001a\u00020\f*\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u001c\u001a0\u0010:\u001a\u00020\u0000*\u00020\u00002\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\b:\u0010;\u001a0\u0010<\u001a\u00020\u0000*\u00020\u00002\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\b<\u0010;\u001a/\u0010=\u001a\u00020\u0000*\u00020\u00002\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0007¢\u0006\u0004\b=\u0010;\u001a0\u0010>\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0087\b¢\u0006\u0004\b>\u0010\u0014\u001a&\u0010?\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0087\b¢\u0006\u0004\b?\u0010\u000f\u001a\u0014\u0010A\u001a\u00020@*\u00020\u0000H\u0087\b¢\u0006\u0004\bA\u0010B\u001a2\u0010E\u001a\u0004\u0018\u00010D*\u00020\u00002\u0006\u0010C\u001a\u00020\u00032\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bE\u0010F\u001a:\u0010H\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010D2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bH\u0010I\u001a6\u0010L\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010K\u0018\u0001*\u00020J*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bL\u0010M\u001a4\u0010N\u001a\u00028\u0000\"\n\b\u0000\u0010K\u0018\u0001*\u00020J*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bN\u0010M\u001a#\u0010S\u001a\u00020R2\u0006\u0010O\u001a\u00020\u00002\n\u0010Q\u001a\u0006\u0012\u0002\b\u00030PH\u0001¢\u0006\u0004\bS\u0010T\u001a4\u0010W\u001a\u00028\u0000\"\n\b\u0000\u0010V\u0018\u0001*\u00020U*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bW\u0010X\u001a>\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010D0Y*\u00020\u00002\u0006\u00109\u001a\u00020\u00032\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bZ\u0010[\u001a(\u0010]\u001a\u00020\\*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\b]\u0010^\u001a\u001c\u0010_\u001a\u00020\u0000*\u00020\u00002\u0006\u0010G\u001a\u00020\\H\u0087\b¢\u0006\u0004\b_\u0010`\u001a*\u0010b\u001a\u0004\u0018\u00010a*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bb\u0010c\u001a\u001c\u0010d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010G\u001a\u00020aH\u0087\b¢\u0006\u0004\bd\u0010e\u001a.\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f*\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0010\"\u00020\u0015H\u0087\b¢\u0006\u0004\bh\u0010i\u001a\"\u0010j\u001a\u00020\u0000*\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020g0fH\u0087\b¢\u0006\u0004\bj\u0010k\u001a\u001c\u0010l\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bl\u0010\b\u001a8\u0010m\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\bm\u0010n\u001a\u0014\u0010o\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\bo\u0010\u0002\u001a0\u0010p\u001a\u00020\u0000*\u00020\u00002\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\bp\u0010;\u001aD\u0010s\u001a\u00020\u00002\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\bs\u0010t\u001aM\u0010v\u001a\u00020\u00002\b\u0010u\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0007¢\u0006\u0004\bv\u0010w\u001a8\u0010x\u001a\u00020\u00002\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0087\b¢\u0006\u0004\bx\u0010y\u001aA\u0010z\u001a\u00020\u00002\b\u0010u\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\u001a\u00109\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u0003080\u0010\"\u0006\u0012\u0002\b\u000308H\u0007¢\u0006\u0004\bz\u0010{\u001a\u001c\u0010|\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b|\u0010\b\u001a\u001c\u0010}\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b}\u0010~\u001a\u0019\u0010\u007f\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0003H\u0087\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a0\u0010\u0082\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0013\u0010\u0081\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0010\"\u00020\u0003H\u0087\b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0018\u0010\u0085\u0001\u001a\u00020\u0000*\u00030\u0084\u0001H\u0087\b¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a2\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000**\u00020\u00002\u0014\u0010\u0012\u001a\u000b\u0012\u0007\b\u0001\u0012\u00030\u0087\u00010\u0010\"\u00030\u0087\u0001H\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a=\u0010\u008f\u0001\u001a\u00020.*\u00020\u00002\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u008a\u00012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\fH\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001aV\u0010\u0094\u0001\u001a\u00020.*\u00020\u00002\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u00012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\f2\u001a\u0010\u0093\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020.0)¢\u0006\u0003\b\u0092\u0001H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001aB\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u008a\u00012\u001a\u0010\u0093\u0001\u001a\u0015\u0012\u0005\u0012\u00030\u0091\u0001\u0012\u0004\u0012\u00020.0)¢\u0006\u0003\b\u0092\u0001H\u0007\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\"!\u0010\u009a\u0001\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0099\u0001\u00106\u001a\u0005\b\u0098\u0001\u0010\u0005\"!\u0010\u009d\u0001\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009c\u0001\u00106\u001a\u0005\b\u009b\u0001\u0010\u0005\"!\u0010 \u0001\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009f\u0001\u00106\u001a\u0005\b\u009e\u0001\u0010\u0005\"\"\u0010£\u0001\u001a\u00020\u0003*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\u000e\u0012\u0005\b¢\u0001\u00106\u001a\u0005\b¡\u0001\u0010\u0005\"!\u0010¦\u0001\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¥\u0001\u00106\u001a\u0005\b¤\u0001\u0010\u0005\"\"\u0010©\u0001\u001a\u00020\u0003*\u00020\u00008Æ\u0002X\u0087\u0004¢\u0006\u000e\u0012\u0005\b¨\u0001\u00106\u001a\u0005\b§\u0001\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ª\u0001"}, d2 = {"Ljava/nio/file/Path;", "d0", "(Ljava/nio/file/Path;)Ljava/nio/file/Path;", "", "e0", "(Ljava/nio/file/Path;)Ljava/lang/String;", "base", "q1", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "s1", "r1", "target", "", "overwrite", "f0", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Ljava/nio/file/Path;", "", "Ljava/nio/file/CopyOption;", "options", "g0", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "Ljava/nio/file/LinkOption;", "A0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "m1", "d1", "Z0", "f1", "(Ljava/nio/file/Path;)Z", "a1", "b1", "c1", "g1", "other", "e1", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z", "glob", "", "h1", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/util/List;", "T", "Lkotlin/Function1;", "Lkotlin/sequences/m;", "block", "y1", "(Ljava/nio/file/Path;Ljava/lang/String;Lld/l;)Ljava/lang/Object;", "Lkotlin/k2;", "action", "H0", "(Ljava/nio/file/Path;Ljava/lang/String;Lld/l;)V", "", "E0", "(Ljava/nio/file/Path;)J", "w0", "(Ljava/nio/file/Path;)V", "x0", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "j0", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "i0", "m0", "k1", "j1", "Ljava/nio/file/FileStore;", "F0", "(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;", "attribute", "", "J0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "value", "t1", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "Ljava/nio/file/attribute/FileAttributeView;", "V", "D0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "C0", "path", "Ljava/lang/Class;", "attributeViewClass", "", "B0", "(Ljava/nio/file/Path;Ljava/lang/Class;)Ljava/lang/Void;", "Ljava/nio/file/attribute/BasicFileAttributes;", "A", "n1", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "o1", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "Ljava/nio/file/attribute/FileTime;", "Q0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "u1", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/FileTime;)Ljava/nio/file/Path;", "Ljava/nio/file/attribute/UserPrincipal;", "V0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "v1", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/UserPrincipal;)Ljava/nio/file/Path;", "", "Ljava/nio/file/attribute/PosixFilePermission;", "Y0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "w1", "(Ljava/nio/file/Path;Ljava/util/Set;)Ljava/nio/file/Path;", "l0", "n0", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "p1", "k0", "prefix", "suffix", "s0", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "directory", "t0", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "o0", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "p0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "z0", "y0", "(Ljava/nio/file/Path;Ljava/lang/String;)Ljava/nio/file/Path;", "b0", "(Ljava/lang/String;)Ljava/nio/file/Path;", "subpaths", "c0", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "Ljava/net/URI;", "x1", "(Ljava/net/URI;)Ljava/nio/file/Path;", "Lkotlin/io/path/t0;", "E1", "(Ljava/nio/file/Path;[Lkotlin/io/path/t0;)Lkotlin/sequences/m;", "Ljava/nio/file/FileVisitor;", "visitor", "", "maxDepth", "followLinks", "B1", "(Ljava/nio/file/Path;Ljava/nio/file/FileVisitor;IZ)V", "Lkotlin/io/path/u;", "Lkotlin/u;", "builderAction", "A1", "(Ljava/nio/file/Path;IZLld/l;)V", "G0", "(Lld/l;)Ljava/nio/file/FileVisitor;", "R0", "S0", "name", "T0", "U0", "nameWithoutExtension", "K0", "L0", "extension", "W0", "X0", "pathString", "O0", "P0", "invariantSeparatorsPathString", "M0", "N0", "invariantSeparatorsPath", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@kotlin.jvm.internal.r1({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
/* loaded from: classes7.dex */
class p3 extends d2 {
    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean A0(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @kotlin.c1(version = "1.7")
    @t
    public static final void A1(@fg.l Path path, int i4, boolean z4, @fg.l ld.l<? super u, kotlin.k2> lVar) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撁\u0001"));
        B1(path, G0(lVar), i4, z4);
    }

    @fg.l
    @kotlin.w0
    public static final Void B0(@fg.l Path path, @fg.l Class<?> cls) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("撂\u0001"));
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("撃\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("撄\u0001") + cls + ProtectedSandApp.s("撅\u0001") + path + '.');
    }

    @kotlin.c1(version = "1.7")
    @t
    public static final void B1(@fg.l Path path, @fg.l FileVisitor<Path> fileVisitor, int i4, boolean z4) {
        Set set;
        FileVisitOption fileVisitOption;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileVisitor, ProtectedSandApp.s("撆\u0001"));
        if (z4) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            set = kotlin.collections.l1.f(fileVisitOption);
        } else {
            set = kotlin.collections.l0.f74939b;
        }
        Files.walkFileTree(path, set, i4, fileVisitor);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <V extends FileAttributeView> V C0(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        kotlin.jvm.internal.l0.P();
        V v4 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v4 != null) {
            return v4;
        }
        kotlin.jvm.internal.l0.P();
        B0(path, FileAttributeView.class);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void C1(Path path, int i4, boolean z4, ld.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        A1(path, i4, z4, lVar);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <V extends FileAttributeView> V D0(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        kotlin.jvm.internal.l0.P();
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static /* synthetic */ void D1(Path path, FileVisitor fileVisitor, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        B1(path, fileVisitor, i4, z4);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final long E0(Path path) throws IOException {
        long size;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        size = Files.size(path);
        return size;
    }

    @fg.l
    @kotlin.c1(version = "1.7")
    @t
    public static final kotlin.sequences.m<Path> E1(@fg.l Path path, @fg.l t0... t0VarArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(t0VarArr, ProtectedSandApp.s("撀\u0001"));
        return new o0(path, t0VarArr);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final FileStore F0(Path path) throws IOException {
        FileStore fileStore;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        fileStore = Files.getFileStore(path);
        kotlin.jvm.internal.l0.o(fileStore, ProtectedSandApp.s("撇\u0001"));
        return fileStore;
    }

    @fg.l
    @kotlin.c1(version = "1.7")
    @t
    public static final FileVisitor<Path> G0(@fg.l ld.l<? super u, kotlin.k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撁\u0001"));
        v vVar = new v();
        lVar.invoke(vVar);
        return vVar.e();
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final void H0(Path path, String str, ld.l<? super Path, kotlin.k2> lVar) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撈\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撉\u0001"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a5 = v1.a(newDirectoryStream);
            kotlin.jvm.internal.l0.m(a5);
            Iterator it = a5.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
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

    static void I0(Path path, String str, ld.l lVar, int i4, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("撊\u0001");
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撈\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撉\u0001"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a5 = v1.a(newDirectoryStream);
            kotlin.jvm.internal.l0.m(a5);
            Iterator it = a5.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            kotlin.k2 k2Var = kotlin.k2.f75408a;
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

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Object J0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撋\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @fg.l
    public static final String K0(@fg.l Path path) {
        Path fileName;
        String obj;
        String o5;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (o5 = kotlin.text.v.o5(obj, '.', "")) == null) ? "" : o5;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static /* synthetic */ void L0(Path path) {
    }

    private static final String M0(Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        return O0(path);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.x0(expression = "invariantSeparatorsPathString", imports = {}))
    @t
    @kotlin.c1(version = "1.4")
    @kotlin.internal.f
    public static /* synthetic */ void N0(Path path) {
    }

    @fg.l
    public static final String O0(@fg.l Path path) {
        FileSystem fileSystem;
        String separator;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        if (kotlin.jvm.internal.l0.g(separator, ProtectedSandApp.s("撌\u0001"))) {
            return path.toString();
        }
        String obj = path.toString();
        kotlin.jvm.internal.l0.m(separator);
        return kotlin.text.v.i2(obj, separator, ProtectedSandApp.s("撌\u0001"), false, 4, null);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static /* synthetic */ void P0(Path path) {
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final FileTime Q0(Path path, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(lastModifiedTime, ProtectedSandApp.s("撍\u0001"));
        return lastModifiedTime;
    }

    @fg.l
    public static final String R0(@fg.l Path path) {
        Path fileName;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static /* synthetic */ void S0(Path path) {
    }

    @fg.l
    public static final String T0(@fg.l Path path) {
        Path fileName;
        String obj;
        String z5;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (z5 = kotlin.text.v.z5(obj, ProtectedSandApp.s("撎\u0001"), null, 2, null)) == null) ? "" : z5;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static /* synthetic */ void U0(Path path) {
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final UserPrincipal V0(Path path, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    private static final String W0(Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        return path.toString();
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    public static /* synthetic */ void X0(Path path) {
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Set<PosixFilePermission> Y0(Path path, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(posixFilePermissions, ProtectedSandApp.s("撏\u0001"));
        return posixFilePermissions;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean Z0(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean a1(Path path) {
        boolean isExecutable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path b0(String str) {
        Path path;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撂\u0001"));
        path = Paths.get(str, new String[0]);
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("撐\u0001"));
        return path;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean b1(Path path) throws IOException {
        boolean isHidden;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path c0(String str, String... strArr) {
        Path path;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撑\u0001"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("撒\u0001"));
        path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("撐\u0001"));
        return path;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean c1(Path path) {
        boolean isReadable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path d0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        absolutePath = path.toAbsolutePath();
        kotlin.jvm.internal.l0.o(absolutePath, ProtectedSandApp.s("撓\u0001"));
        return absolutePath;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean d1(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final String e0(Path path) {
        Path absolutePath;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean e1(Path path, Path path2) throws IOException {
        boolean isSameFile;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撔\u0001"));
        isSameFile = Files.isSameFile(path, path2);
        return isSameFile;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path f0(Path path, Path path2, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("撖\u0001"));
        return copy;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean f1(Path path) {
        boolean isSymbolicLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path g0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        kotlin.jvm.internal.l0.p(copyOptionArr, ProtectedSandApp.s("撀\u0001"));
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("撖\u0001"));
        return copy;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean g1(Path path) {
        boolean isWritable;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    static /* synthetic */ Path h0(Path path, Path path2, boolean z4, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(copy, ProtectedSandApp.s("撖\u0001"));
        return copy;
    }

    @kotlin.o2(markerClass = {t.class})
    @fg.l
    @kotlin.c1(version = "1.5")
    public static final List<Path> h1(@fg.l Path path, @fg.l String str) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撈\u0001"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a5 = v1.a(newDirectoryStream);
            kotlin.jvm.internal.l0.m(a5);
            List<Path> V5 = kotlin.collections.w.V5(a5);
            kotlin.io.b.a(newDirectoryStream, null);
            return V5;
        } finally {
        }
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path i0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createDirectories, ProtectedSandApp.s("撘\u0001"));
        return createDirectories;
    }

    public static /* synthetic */ List i1(Path path, String str, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("撊\u0001");
        }
        return h1(path, str);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path j0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createDirectory, ProtectedSandApp.s("撙\u0001"));
        return createDirectory;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path j1(Path path, Path path2, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("撚\u0001"));
        return move;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path k0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createFile, ProtectedSandApp.s("撛\u0001"));
        return createFile;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path k1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        kotlin.jvm.internal.l0.p(copyOptionArr, ProtectedSandApp.s("撀\u0001"));
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("撚\u0001"));
        return move;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path l0(Path path, Path path2) throws IOException {
        Path createLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        createLink = Files.createLink(path, path2);
        kotlin.jvm.internal.l0.o(createLink, ProtectedSandApp.s("撜\u0001"));
        return createLink;
    }

    static /* synthetic */ Path l1(Path path, Path path2, boolean z4, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        CopyOption[] copyOptionArr = z4 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        kotlin.jvm.internal.l0.o(move, ProtectedSandApp.s("撚\u0001"));
        return move;
    }

    @fg.l
    @kotlin.c1(version = "1.9")
    public static final Path m0(@fg.l Path path, @fg.l FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path parent = path.getParent();
        if (parent != null && !Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
            try {
                FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                kotlin.jvm.internal.l0.o(Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length)), ProtectedSandApp.s("撘\u0001"));
            } catch (FileAlreadyExistsException e4) {
                if (!Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw e4;
                }
            }
        }
        return path;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean m1(Path path, LinkOption... linkOptionArr) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path n0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撕\u0001"));
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createSymbolicLink, ProtectedSandApp.s("撝\u0001"));
        return createSymbolicLink;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <A extends BasicFileAttributes> A n1(Path path, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        kotlin.jvm.internal.l0.P();
        A a5 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("撞\u0001"));
        return a5;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path o0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, ProtectedSandApp.s("撟\u0001"));
        return createTempDirectory;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Map<String, Object> o1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撗\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(readAttributes, ProtectedSandApp.s("撞\u0001"));
        return readAttributes;
    }

    @kotlin.o2(markerClass = {t.class})
    @fg.l
    @kotlin.c1(version = "1.5")
    public static final Path p0(@fg.m Path path, @fg.m String str, @fg.l FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        String s4 = ProtectedSandApp.s("撟\u0001");
        if (path != null) {
            Path createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            kotlin.jvm.internal.l0.o(createTempDirectory, s4);
            return createTempDirectory;
        }
        Path createTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory2, s4);
        return createTempDirectory2;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path p1(Path path) throws IOException {
        Path readSymbolicLink;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        readSymbolicLink = Files.readSymbolicLink(path);
        kotlin.jvm.internal.l0.o(readSymbolicLink, ProtectedSandApp.s("撠\u0001"));
        return readSymbolicLink;
    }

    static /* synthetic */ Path q0(String str, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            str = null;
        }
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempDirectory, ProtectedSandApp.s("撟\u0001"));
        return createTempDirectory;
    }

    @fg.l
    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static final Path q1(@fg.l Path path, @fg.l Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撑\u0001"));
        try {
            return k0.f75225a.a(path, path2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(e4.getMessage() + ProtectedSandApp.s("撡\u0001") + path + ProtectedSandApp.s("撢\u0001") + path2, e4);
        }
    }

    public static /* synthetic */ Path r0(Path path, String str, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            str = null;
        }
        return p0(path, str, fileAttributeArr);
    }

    @kotlin.o2(markerClass = {t.class})
    @fg.m
    @kotlin.c1(version = "1.5")
    public static final Path r1(@fg.l Path path, @fg.l Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撑\u0001"));
        try {
            return k0.f75225a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path s0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile, ProtectedSandApp.s("撣\u0001"));
        return createTempFile;
    }

    @fg.l
    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    public static final Path s1(@fg.l Path path, @fg.l Path path2) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撑\u0001"));
        Path r12 = r1(path, path2);
        return r12 == null ? path : r12;
    }

    @kotlin.o2(markerClass = {t.class})
    @fg.l
    @kotlin.c1(version = "1.5")
    public static final Path t0(@fg.m Path path, @fg.m String str, @fg.m String str2, @fg.l FileAttribute<?>... fileAttributeArr) throws IOException {
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        String s4 = ProtectedSandApp.s("撣\u0001");
        if (path != null) {
            Path createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            kotlin.jvm.internal.l0.o(createTempFile, s4);
            return createTempFile;
        }
        Path createTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile2, s4);
        return createTempFile2;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path t1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撋\u0001"));
        kotlin.jvm.internal.l0.p(linkOptionArr, ProtectedSandApp.s("撀\u0001"));
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        kotlin.jvm.internal.l0.o(attribute, ProtectedSandApp.s("撤\u0001"));
        return attribute;
    }

    static /* synthetic */ Path u0(String str, String str2, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        kotlin.jvm.internal.l0.p(fileAttributeArr, ProtectedSandApp.s("撗\u0001"));
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        kotlin.jvm.internal.l0.o(createTempFile, ProtectedSandApp.s("撣\u0001"));
        return createTempFile;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path u1(Path path, FileTime fileTime) throws IOException {
        Path lastModifiedTime;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(fileTime, ProtectedSandApp.s("撥\u0001"));
        lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        kotlin.jvm.internal.l0.o(lastModifiedTime, ProtectedSandApp.s("撦\u0001"));
        return lastModifiedTime;
    }

    public static /* synthetic */ Path v0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            str = null;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        return t0(path, str, str2, fileAttributeArr);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path v1(Path path, UserPrincipal userPrincipal) throws IOException {
        Path owner;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(userPrincipal, ProtectedSandApp.s("撥\u0001"));
        owner = Files.setOwner(path, userPrincipal);
        kotlin.jvm.internal.l0.o(owner, ProtectedSandApp.s("撧\u0001"));
        return owner;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final void w0(Path path) throws IOException {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        Files.delete(path);
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path w1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        Path posixFilePermissions;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("撥\u0001"));
        posixFilePermissions = Files.setPosixFilePermissions(path, set);
        kotlin.jvm.internal.l0.o(posixFilePermissions, ProtectedSandApp.s("撨\u0001"));
        return posixFilePermissions;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final boolean x0(Path path) throws IOException {
        boolean deleteIfExists;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path x1(URI uri) {
        Path path;
        kotlin.jvm.internal.l0.p(uri, ProtectedSandApp.s("摿\u0001"));
        path = Paths.get(uri);
        kotlin.jvm.internal.l0.o(path, ProtectedSandApp.s("撐\u0001"));
        return path;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path y0(Path path, String str) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撔\u0001"));
        resolve = path.resolve(str);
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("撩\u0001"));
        return resolve;
    }

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final <T> T y1(Path path, String str, ld.l<? super kotlin.sequences.m<? extends Path>, ? extends T> lVar) throws IOException {
        DirectoryStream newDirectoryStream;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撈\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撪\u0001"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a5 = v1.a(newDirectoryStream);
            kotlin.jvm.internal.l0.m(a5);
            T invoke = lVar.invoke(kotlin.collections.w.A1(a5));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return invoke;
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

    @kotlin.o2(markerClass = {t.class})
    @kotlin.c1(version = "1.5")
    @kotlin.internal.f
    private static final Path z0(Path path, Path path2) {
        Path resolve;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("撔\u0001"));
        resolve = path.resolve(path2);
        kotlin.jvm.internal.l0.o(resolve, ProtectedSandApp.s("撩\u0001"));
        return resolve;
    }

    static Object z1(Path path, String str, ld.l lVar, int i4, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i4 & 1) != 0) {
            str = ProtectedSandApp.s("撊\u0001");
        }
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摿\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("撈\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("撪\u0001"));
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a5 = v1.a(newDirectoryStream);
            kotlin.jvm.internal.l0.m(a5);
            Object invoke = lVar.invoke(kotlin.collections.w.A1(a5));
            if (kotlin.internal.m.a(1, 1, 0)) {
                kotlin.io.b.a(newDirectoryStream, null);
            } else if (newDirectoryStream != null) {
                newDirectoryStream.close();
            }
            return invoke;
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
