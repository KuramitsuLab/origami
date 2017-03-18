package origami.rule;

import java.util.Locale;
import java.util.ResourceBundle;

import origami.OConsole;

public enum OFmt implements LocaleFormat {
	welcome, error, warning, notice, info, //
	// syntax analysis
	syntax_error, //
//	not_assignable,
	// name analysis
	undefined, mismatched, read_only__YY0, //
	unfound, stupid, //
	name, type, syntax, clazz, constructor, //
	implicit_conversion__YY0_to_YY1, //
	YY0_is_not_here, //
	implicit_mutation, YY0_is_duplicated, YY0_is_unknown_name,
	// newly
	studpid_cast__YY0_to_YY1, nullable, //
	defineded, origami, unnecessary_expression, stupid_expression, implicit_type, //
	undefined_unit__YY0, not_clonable, YY0_is_meaningless, YY0_is_not_constant_value, //
	S_must_be_S, assertion_failed, //
	undefined_name__YY0, type_inferred__YY0, YY0_does_not_exist, undefined_syntax__YY0, //
	unfound_class__YY0_by_YY1, undefined_type__YY0, no_typing_hint__YY0, //
	YY0_is_not_assignable, YY0_is_not_throwable, YY0_is_not_interface, //
	undefined_static_field__YY0_YY1, undefined_field__YY0_YY1;

//	public static String fmt(String fmt, OFmt... m) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < m.length; i++) {
//			if (i > 0) {
//				sb.append(__.toString());
//			}
//			sb.append(m[i].toString());
//		}
//		if (fmt != null) {
//			sb.append(" ");
//			sb.append(fmt);
//		}
//		return sb.toString();
//	}

//	public static String fmt(OFmt... m) {
//		return fmt(null, m);
//	}
	
	public static String quote(Object o) {
		return OConsole.bold("'" + o + "'");
	}

	@Override
	public String error() {
		return error.toString();
	}

	@Override
	public String warning() {
		return warning.toString();
	}

	@Override
	public String notice() {
		return notice.toString();
	}

	@Override
	public String toString() {
		return stringfy(name());
	}

}
