/*
 * generated by Xtext 2.32.0
 */
package fr.l127.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LAGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class LibrairieElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.l127.LA.Librairie");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLibrairiesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAlgorithmeParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Librairie:
		//    'librairies' name=ID '{'
		//     elements+=Algorithme*
		//     '}'
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//'librairies' name=ID '{'
		// elements+=Algorithme*
		// '}'
		public Group getGroup() { return cGroup; }
		
		//'librairies'
		public Keyword getLibrairiesKeyword_0() { return cLibrairiesKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=Algorithme*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//Algorithme
		public RuleCall getElementsAlgorithmeParserRuleCall_3_0() { return cElementsAlgorithmeParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AlgorithmeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.l127.LA.Algorithme");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlgoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEntreesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cEntreesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cEntreesEntreeParserRuleCall_5_0 = (RuleCall)cEntreesAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSortiesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cSortiesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cSortiesSortieParserRuleCall_9_0 = (RuleCall)cSortiesAssignment_9.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cCheminKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cCheminAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cCheminSTRINGTerminalRuleCall_12_0 = (RuleCall)cCheminAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Algorithme :
		//    'algo' name=ID '{'
		//        'entrees' '(' (entrees+=Entree)+ ')'
		//        'sorties' '(' (sorties+=Sortie)+ ')'
		//        'chemin' chemin=STRING
		//    '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'algo' name=ID '{'
		//    'entrees' '(' (entrees+=Entree)+ ')'
		//    'sorties' '(' (sorties+=Sortie)+ ')'
		//    'chemin' chemin=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'algo'
		public Keyword getAlgoKeyword_0() { return cAlgoKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'entrees'
		public Keyword getEntreesKeyword_3() { return cEntreesKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//(entrees+=Entree)+
		public Assignment getEntreesAssignment_5() { return cEntreesAssignment_5; }
		
		//Entree
		public RuleCall getEntreesEntreeParserRuleCall_5_0() { return cEntreesEntreeParserRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//'sorties'
		public Keyword getSortiesKeyword_7() { return cSortiesKeyword_7; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_8() { return cLeftParenthesisKeyword_8; }
		
		//(sorties+=Sortie)+
		public Assignment getSortiesAssignment_9() { return cSortiesAssignment_9; }
		
		//Sortie
		public RuleCall getSortiesSortieParserRuleCall_9_0() { return cSortiesSortieParserRuleCall_9_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_10() { return cRightParenthesisKeyword_10; }
		
		//'chemin'
		public Keyword getCheminKeyword_11() { return cCheminKeyword_11; }
		
		//chemin=STRING
		public Assignment getCheminAssignment_12() { return cCheminAssignment_12; }
		
		//STRING
		public RuleCall getCheminSTRINGTerminalRuleCall_12_0() { return cCheminSTRINGTerminalRuleCall_12_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	public class EntreeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.l127.LA.Entree");
		private final Assignment cIdColonneAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdColonneINTTerminalRuleCall_0 = (RuleCall)cIdColonneAssignment.eContents().get(0);
		
		//Entree :
		//    idColonne = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//idColonne = INT
		public Assignment getIdColonneAssignment() { return cIdColonneAssignment; }
		
		//INT
		public RuleCall getIdColonneINTTerminalRuleCall_0() { return cIdColonneINTTerminalRuleCall_0; }
	}
	public class SortieElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.l127.LA.Sortie");
		private final Assignment cIdColonneAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdColonneINTTerminalRuleCall_0 = (RuleCall)cIdColonneAssignment.eContents().get(0);
		
		//Sortie :
		//    idColonne = INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//idColonne = INT
		public Assignment getIdColonneAssignment() { return cIdColonneAssignment; }
		
		//INT
		public RuleCall getIdColonneINTTerminalRuleCall_0() { return cIdColonneINTTerminalRuleCall_0; }
	}
	
	
	private final LibrairieElements pLibrairie;
	private final AlgorithmeElements pAlgorithme;
	private final EntreeElements pEntree;
	private final SortieElements pSortie;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LAGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLibrairie = new LibrairieElements();
		this.pAlgorithme = new AlgorithmeElements();
		this.pEntree = new EntreeElements();
		this.pSortie = new SortieElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.l127.LA".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Librairie:
	//    'librairies' name=ID '{'
	//     elements+=Algorithme*
	//     '}'
	//    ;
	public LibrairieElements getLibrairieAccess() {
		return pLibrairie;
	}
	
	public ParserRule getLibrairieRule() {
		return getLibrairieAccess().getRule();
	}
	
	//Algorithme :
	//    'algo' name=ID '{'
	//        'entrees' '(' (entrees+=Entree)+ ')'
	//        'sorties' '(' (sorties+=Sortie)+ ')'
	//        'chemin' chemin=STRING
	//    '}'
	//;
	public AlgorithmeElements getAlgorithmeAccess() {
		return pAlgorithme;
	}
	
	public ParserRule getAlgorithmeRule() {
		return getAlgorithmeAccess().getRule();
	}
	
	//Entree :
	//    idColonne = INT
	//;
	public EntreeElements getEntreeAccess() {
		return pEntree;
	}
	
	public ParserRule getEntreeRule() {
		return getEntreeAccess().getRule();
	}
	
	//Sortie :
	//    idColonne = INT
	//;
	public SortieElements getSortieAccess() {
		return pSortie;
	}
	
	public ParserRule getSortieRule() {
		return getSortieAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
