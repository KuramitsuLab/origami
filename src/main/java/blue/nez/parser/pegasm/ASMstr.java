package blue.nez.parser.pegasm;

import blue.nez.parser.PegAsmInst;
import blue.nez.parser.pegasm.PegAsm.AbstStr;
import blue.nez.parser.PegAsmContext;
import blue.nez.parser.ParserTerminationException;

public final class ASMstr extends AbstStr {
	public ASMstr(byte[] byteSeq, PegAsmInst next) {
		super(byteSeq, next);
	}

	@Override
	public void visit(PegAsmVisitor v) {
		v.visitStr(this);
	}

	@Override
	public PegAsmInst exec(PegAsmContext<?> sc) throws ParserTerminationException {
		if (sc.match(this.utf8)) {
			return this.next;
		}
		return sc.raiseFail();
	}

}