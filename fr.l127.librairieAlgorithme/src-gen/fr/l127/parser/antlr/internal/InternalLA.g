/*
 * generated by Xtext 2.32.0
 */
grammar InternalLA;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.l127.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.l127.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.l127.services.LAGrammarAccess;

}

@parser::members {

 	private LAGrammarAccess grammarAccess;

    public InternalLAParser(TokenStream input, LAGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Librairie";
   	}

   	@Override
   	protected LAGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleLibrairie
entryRuleLibrairie returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLibrairieRule()); }
	iv_ruleLibrairie=ruleLibrairie
	{ $current=$iv_ruleLibrairie.current; }
	EOF;

// Rule Librairie
ruleLibrairie returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='librairies'
		{
			newLeafNode(otherlv_0, grammarAccess.getLibrairieAccess().getLibrairiesKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLibrairieAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLibrairieRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLibrairieAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLibrairieAccess().getElementsAlgorithmeParserRuleCall_3_0());
				}
				lv_elements_3_0=ruleAlgorithme
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLibrairieRule());
					}
					add(
						$current,
						"elements",
						lv_elements_3_0,
						"fr.l127.LA.Algorithme");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getLibrairieAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAlgorithme
entryRuleAlgorithme returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlgorithmeRule()); }
	iv_ruleAlgorithme=ruleAlgorithme
	{ $current=$iv_ruleAlgorithme.current; }
	EOF;

// Rule Algorithme
ruleAlgorithme returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='algo'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgoKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAlgorithmeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlgorithmeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='entrees'
		{
			newLeafNode(otherlv_3, grammarAccess.getAlgorithmeAccess().getEntreesKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getAlgorithmeAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlgorithmeAccess().getEntreesEntreeParserRuleCall_5_0());
				}
				lv_entrees_5_0=ruleEntree
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
					}
					add(
						$current,
						"entrees",
						lv_entrees_5_0,
						"fr.l127.LA.Entree");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAlgorithmeAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='sorties'
		{
			newLeafNode(otherlv_7, grammarAccess.getAlgorithmeAccess().getSortiesKeyword_7());
		}
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getAlgorithmeAccess().getLeftParenthesisKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAlgorithmeAccess().getSortiesSortieParserRuleCall_9_0());
				}
				lv_sorties_9_0=ruleSortie
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
					}
					add(
						$current,
						"sorties",
						lv_sorties_9_0,
						"fr.l127.LA.Sortie");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getAlgorithmeAccess().getRightParenthesisKeyword_10());
		}
		otherlv_11='chemin'
		{
			newLeafNode(otherlv_11, grammarAccess.getAlgorithmeAccess().getCheminKeyword_11());
		}
		(
			(
				lv_chemin_12_0=RULE_STRING
				{
					newLeafNode(lv_chemin_12_0, grammarAccess.getAlgorithmeAccess().getCheminSTRINGTerminalRuleCall_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlgorithmeRule());
					}
					setWithLastConsumed(
						$current,
						"chemin",
						lv_chemin_12_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleEntree
entryRuleEntree returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntreeRule()); }
	iv_ruleEntree=ruleEntree
	{ $current=$iv_ruleEntree.current; }
	EOF;

// Rule Entree
ruleEntree returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_idColonne_0_0=RULE_INT
			{
				newLeafNode(lv_idColonne_0_0, grammarAccess.getEntreeAccess().getIdColonneINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEntreeRule());
				}
				setWithLastConsumed(
					$current,
					"idColonne",
					lv_idColonne_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleSortie
entryRuleSortie returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSortieRule()); }
	iv_ruleSortie=ruleSortie
	{ $current=$iv_ruleSortie.current; }
	EOF;

// Rule Sortie
ruleSortie returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_idColonne_0_0=RULE_INT
			{
				newLeafNode(lv_idColonne_0_0, grammarAccess.getSortieAccess().getIdColonneINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSortieRule());
				}
				setWithLastConsumed(
					$current,
					"idColonne",
					lv_idColonne_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
