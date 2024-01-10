/*
 * generated by Xtext 2.32.0
 */
package fr.l127.parser.antlr;

import com.google.inject.Inject;
import fr.l127.parser.antlr.internal.InternalLAParser;
import fr.l127.services.LAGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LAParser extends AbstractAntlrParser {

	@Inject
	private LAGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLAParser createParser(XtextTokenStream stream) {
		return new InternalLAParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Librairie";
	}

	public LAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
