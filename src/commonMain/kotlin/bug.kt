// The compiler works with either all `<T>`s removed or `@SinceKotlin("1.0")` removed.
// With the annotation changing to, for example, `@Suppress("UNUSED")` , the compiler still does not work.
@JvmInline
value class Value<T>(val strValue: String)

@SinceKotlin("1.0")
val <T> Value<T>.value: String
    get() = strValue
