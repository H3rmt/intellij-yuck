// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YuckParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  /* ********************************************************** */
  // ACTIVEPROP (true  | false)
  public static boolean ActiveProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActiveProp")) return false;
    if (!nextTokenIs(b, ACTIVEPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ACTIVE_PROP, null);
    r = consumeToken(b, ACTIVEPROP);
    p = r; // pin = 1
    r = r && ActiveProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean ActiveProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ActiveProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // LPAREN BOX BoxProps* Widget* RPAREN
  public static boolean BoxDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoxDefinition")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BOX_DEFINITION, null);
    r = consumeTokens(b, 2, LPAREN, BOX);
    p = r; // pin = 2
    r = r && report_error_(b, BoxDefinition_2(b, l + 1));
    r = p && report_error_(b, BoxDefinition_3(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BoxProps*
  private static boolean BoxDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoxDefinition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BoxProps(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BoxDefinition_2", c)) break;
    }
    return true;
  }

  // Widget*
  private static boolean BoxDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoxDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Widget(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BoxDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SpacingProp |
  //     OrientationProp |
  //     SpaceEvenlyProp |
  //     WidgetProp
  static boolean BoxProps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoxProps")) return false;
    boolean r;
    r = SpacingProp(b, l + 1);
    if (!r) r = OrientationProp(b, l + 1);
    if (!r) r = SpaceEvenlyProp(b, l + 1);
    if (!r) r = WidgetProp(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CLASSPROP (string)
  public static boolean ClassProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ClassProp")) return false;
    if (!nextTokenIs(b, CLASSPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_PROP, null);
    r = consumeToken(b, CLASSPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LPAREN COMBOBOXTEXT ComboBoxTextProp* Widget* RPAREN
  public static boolean ComboBoxTextDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComboBoxTextDefinition")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMBO_BOX_TEXT_DEFINITION, null);
    r = consumeTokens(b, 2, LPAREN, COMBOBOXTEXT);
    p = r; // pin = 2
    r = r && report_error_(b, ComboBoxTextDefinition_2(b, l + 1));
    r = p && report_error_(b, ComboBoxTextDefinition_3(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ComboBoxTextProp*
  private static boolean ComboBoxTextDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComboBoxTextDefinition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ComboBoxTextProp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComboBoxTextDefinition_2", c)) break;
    }
    return true;
  }

  // Widget*
  private static boolean ComboBoxTextDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComboBoxTextDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Widget(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ComboBoxTextDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TimeoutProp |
  //     OnChangeProp |
  //     WidgetProp
  static boolean ComboBoxTextProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ComboBoxTextProp")) return false;
    boolean r;
    r = TimeoutProp(b, l + 1);
    if (!r) r = OnChangeProp(b, l + 1);
    if (!r) r = WidgetProp(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CSSPROP (string)
  public static boolean CssProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CssProp")) return false;
    if (!nextTokenIs(b, CSSPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CSS_PROP, null);
    r = consumeToken(b, CSSPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LPAREN DEFWIDGET identifier CustomWidgetDefinitionBrackets Widget* RPAREN
  public static boolean CustomWidgetDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CustomWidgetDefinition")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CUSTOM_WIDGET_DEFINITION, null);
    r = consumeTokens(b, 2, LPAREN, DEFWIDGET, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, CustomWidgetDefinitionBrackets(b, l + 1));
    r = p && report_error_(b, CustomWidgetDefinition_4(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Widget*
  private static boolean CustomWidgetDefinition_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CustomWidgetDefinition_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Widget(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CustomWidgetDefinition_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LBRACKET RBRACKET
  public static boolean CustomWidgetDefinitionBrackets(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CustomWidgetDefinitionBrackets")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CUSTOM_WIDGET_DEFINITION_BRACKETS, null);
    r = consumeTokens(b, 1, LBRACKET, RBRACKET);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LPAREN identifier RPAREN
  public static boolean CustomWidgetReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CustomWidgetReference")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CUSTOM_WIDGET_REFERENCE, null);
    r = consumeTokens(b, 2, LPAREN, IDENTIFIER, RPAREN);
    p = r; // pin = 2
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // !<<eof>>(WindowDefinition | CustomWidgetDefinition)
  static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = Definition_0(b, l + 1);
    p = r; // pin = 1
    r = r && Definition_1(b, l + 1);
    exit_section_(b, l, m, r, p, YuckParser::TopLevelRecover);
    return r || p;
  }

  // !<<eof>>
  private static boolean Definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WindowDefinition | CustomWidgetDefinition
  private static boolean Definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition_1")) return false;
    boolean r;
    r = WindowDefinition(b, l + 1);
    if (!r) r = CustomWidgetDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EXPANDEDPROP (true  | false)
  public static boolean ExpandProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpandProp")) return false;
    if (!nextTokenIs(b, EXPANDEDPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPAND_PROP, null);
    r = consumeToken(b, EXPANDEDPROP);
    p = r; // pin = 1
    r = r && ExpandProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean ExpandProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpandProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // LPAREN EXPANDER ExpanderProps* Widget* RPAREN
  public static boolean ExpanderDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpanderDefinition")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPANDER_DEFINITION, null);
    r = consumeTokens(b, 2, LPAREN, EXPANDER);
    p = r; // pin = 2
    r = r && report_error_(b, ExpanderDefinition_2(b, l + 1));
    r = p && report_error_(b, ExpanderDefinition_3(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ExpanderProps*
  private static boolean ExpanderDefinition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpanderDefinition_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ExpanderProps(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpanderDefinition_2", c)) break;
    }
    return true;
  }

  // Widget*
  private static boolean ExpanderDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpanderDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Widget(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExpanderDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NameProp |
  //     ExpandProp |
  //     WidgetProp
  static boolean ExpanderProps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExpanderProps")) return false;
    boolean r;
    r = NameProp(b, l + 1);
    if (!r) r = ExpandProp(b, l + 1);
    if (!r) r = WidgetProp(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // Definition *
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // HALIGNPROP ("fill" | "baseline" | "center" | "start" | "end")
  public static boolean HalignProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HalignProp")) return false;
    if (!nextTokenIs(b, HALIGNPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HALIGN_PROP, null);
    r = consumeToken(b, HALIGNPROP);
    p = r; // pin = 1
    r = r && HalignProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "fill" | "baseline" | "center" | "start" | "end"
  private static boolean HalignProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HalignProp_1")) return false;
    boolean r;
    r = consumeToken(b, "fill");
    if (!r) r = consumeToken(b, "baseline");
    if (!r) r = consumeToken(b, "center");
    if (!r) r = consumeToken(b, "start");
    if (!r) r = consumeToken(b, "end");
    return r;
  }

  /* ********************************************************** */
  // HEIGHTPROP (int)
  public static boolean HeightProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HeightProp")) return false;
    if (!nextTokenIs(b, HEIGHTPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEIGHT_PROP, null);
    r = consumeToken(b, HEIGHTPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, INT);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // HEXPANDPROP (true  | false)
  public static boolean HexpandProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexpandProp")) return false;
    if (!nextTokenIs(b, HEXPANDPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, HEXPAND_PROP, null);
    r = consumeToken(b, HEXPANDPROP);
    p = r; // pin = 1
    r = r && HexpandProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean HexpandProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "HexpandProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // MONITORPROP (int | float | identifier)
  public static boolean MonitorProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MonitorProp")) return false;
    if (!nextTokenIs(b, MONITORPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MONITOR_PROP, null);
    r = consumeToken(b, MONITORPROP);
    p = r; // pin = 1
    r = r && MonitorProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // int | float | identifier
  private static boolean MonitorProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MonitorProp_1")) return false;
    boolean r;
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, IDENTIFIER);
    return r;
  }

  /* ********************************************************** */
  // NAMEPROP (string)
  public static boolean NameProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NameProp")) return false;
    if (!nextTokenIs(b, NAMEPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, NAME_PROP, null);
    r = consumeToken(b, NAMEPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ONCHANGEPROP (string)
  public static boolean OnChangeProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OnChangeProp")) return false;
    if (!nextTokenIs(b, ONCHANGEPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ON_CHANGE_PROP, null);
    r = consumeToken(b, ONCHANGEPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ORIENTATIONPROP ("vertical" | "v" | "horizontal" | "h")
  public static boolean OrientationProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrientationProp")) return false;
    if (!nextTokenIs(b, ORIENTATIONPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ORIENTATION_PROP, null);
    r = consumeToken(b, ORIENTATIONPROP);
    p = r; // pin = 1
    r = r && OrientationProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "vertical" | "v" | "horizontal" | "h"
  private static boolean OrientationProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OrientationProp_1")) return false;
    boolean r;
    r = consumeToken(b, "vertical");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "horizontal");
    if (!r) r = consumeToken(b, "h");
    return r;
  }

  /* ********************************************************** */
  // ComboBoxTextDefinition | ExpanderDefinition | BoxDefinition
  static boolean PredefinedWidget(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PredefinedWidget")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    r = ComboBoxTextDefinition(b, l + 1);
    if (!r) r = ExpanderDefinition(b, l + 1);
    if (!r) r = BoxDefinition(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(MONITORPROP | WMIGNOREPROP | LPAREN)
  static boolean PropValueRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropValueRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !PropValueRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MONITORPROP | WMIGNOREPROP | LPAREN
  private static boolean PropValueRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropValueRecover_0")) return false;
    boolean r;
    r = consumeToken(b, MONITORPROP);
    if (!r) r = consumeToken(b, WMIGNOREPROP);
    if (!r) r = consumeToken(b, LPAREN);
    return r;
  }

  /* ********************************************************** */
  // SPACEEVENLYPROP (true  | false)
  public static boolean SpaceEvenlyProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpaceEvenlyProp")) return false;
    if (!nextTokenIs(b, SPACEEVENLYPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SPACE_EVENLY_PROP, null);
    r = consumeToken(b, SPACEEVENLYPROP);
    p = r; // pin = 1
    r = r && SpaceEvenlyProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean SpaceEvenlyProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpaceEvenlyProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // SPACINGPROP (int)
  public static boolean SpacingProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpacingProp")) return false;
    if (!nextTokenIs(b, SPACINGPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SPACING_PROP, null);
    r = consumeToken(b, SPACINGPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, INT);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // STYLEPROP (string)
  public static boolean StyleProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StyleProp")) return false;
    if (!nextTokenIs(b, STYLEPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STYLE_PROP, null);
    r = consumeToken(b, STYLEPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TIMEOUTPROP (int)
  public static boolean TimeoutProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TimeoutProp")) return false;
    if (!nextTokenIs(b, TIMEOUTPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TIMEOUT_PROP, null);
    r = consumeToken(b, TIMEOUTPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, INT);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TOOLTIPPROP (string)
  public static boolean TooltipProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TooltipProp")) return false;
    if (!nextTokenIs(b, TOOLTIPPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TOOLTIP_PROP, null);
    r = consumeToken(b, TOOLTIPPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, STRING);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // !((LPAREN DEFWINDOW) | (LPAREN DEFWIDGET))
  static boolean TopLevelRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TopLevelRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LPAREN DEFWINDOW) | (LPAREN DEFWIDGET)
  private static boolean TopLevelRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TopLevelRecover_0_0(b, l + 1);
    if (!r) r = TopLevelRecover_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN DEFWINDOW
  private static boolean TopLevelRecover_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelRecover_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, DEFWINDOW);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN DEFWIDGET
  private static boolean TopLevelRecover_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TopLevelRecover_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, DEFWIDGET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALIGNPROP ("fill" | "baseline" | "center" | "start" | "end")
  public static boolean ValignProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValignProp")) return false;
    if (!nextTokenIs(b, VALIGNPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VALIGN_PROP, null);
    r = consumeToken(b, VALIGNPROP);
    p = r; // pin = 1
    r = r && ValignProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "fill" | "baseline" | "center" | "start" | "end"
  private static boolean ValignProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValignProp_1")) return false;
    boolean r;
    r = consumeToken(b, "fill");
    if (!r) r = consumeToken(b, "baseline");
    if (!r) r = consumeToken(b, "center");
    if (!r) r = consumeToken(b, "start");
    if (!r) r = consumeToken(b, "end");
    return r;
  }

  /* ********************************************************** */
  // VEXPANDPROP (true  | false)
  public static boolean VexpandProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VexpandProp")) return false;
    if (!nextTokenIs(b, VEXPANDPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VEXPAND_PROP, null);
    r = consumeToken(b, VEXPANDPROP);
    p = r; // pin = 1
    r = r && VexpandProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean VexpandProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VexpandProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // VISIBLEPROP (true  | false)
  public static boolean VisibleProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisibleProp")) return false;
    if (!nextTokenIs(b, VISIBLEPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VISIBLE_PROP, null);
    r = consumeToken(b, VISIBLEPROP);
    p = r; // pin = 1
    r = r && VisibleProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean VisibleProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisibleProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

  /* ********************************************************** */
  // CustomWidgetReference | PredefinedWidget
  static boolean Widget(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Widget")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    r = CustomWidgetReference(b, l + 1);
    if (!r) r = PredefinedWidget(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ClassProp |
  //     ValignProp |
  //     HalignProp |
  //     VexpandProp |
  //     HexpandProp |
  //     WidthProp |
  //     HeightProp |
  //     ActiveProp |
  //     TooltipProp |
  //     VisibleProp |
  //     StyleProp |
  //     CssProp
  static boolean WidgetProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetProp")) return false;
    boolean r;
    r = ClassProp(b, l + 1);
    if (!r) r = ValignProp(b, l + 1);
    if (!r) r = HalignProp(b, l + 1);
    if (!r) r = VexpandProp(b, l + 1);
    if (!r) r = HexpandProp(b, l + 1);
    if (!r) r = WidthProp(b, l + 1);
    if (!r) r = HeightProp(b, l + 1);
    if (!r) r = ActiveProp(b, l + 1);
    if (!r) r = TooltipProp(b, l + 1);
    if (!r) r = VisibleProp(b, l + 1);
    if (!r) r = StyleProp(b, l + 1);
    if (!r) r = CssProp(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // !(RPAREN |  (LPAREN COMBOBOXTEXT) | (LPAREN EXPANDER) | (LPAREN BOX))
  static boolean WidgetRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !WidgetRecover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // RPAREN |  (LPAREN COMBOBOXTEXT) | (LPAREN EXPANDER) | (LPAREN BOX)
  private static boolean WidgetRecover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetRecover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RPAREN);
    if (!r) r = WidgetRecover_0_1(b, l + 1);
    if (!r) r = WidgetRecover_0_2(b, l + 1);
    if (!r) r = WidgetRecover_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN COMBOBOXTEXT
  private static boolean WidgetRecover_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetRecover_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, COMBOBOXTEXT);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN EXPANDER
  private static boolean WidgetRecover_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetRecover_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, EXPANDER);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN BOX
  private static boolean WidgetRecover_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidgetRecover_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, BOX);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WIDTHPROP (int)
  public static boolean WidthProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WidthProp")) return false;
    if (!nextTokenIs(b, WIDTHPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WIDTH_PROP, null);
    r = consumeToken(b, WIDTHPROP);
    p = r; // pin = 1
    r = r && consumeToken(b, INT);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // LPAREN DEFWINDOW identifier WindowProp* Widget RPAREN
  public static boolean WindowDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WindowDefinition")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WINDOW_DEFINITION, null);
    r = consumeTokens(b, 2, LPAREN, DEFWINDOW, IDENTIFIER);
    p = r; // pin = 2
    r = r && report_error_(b, WindowDefinition_3(b, l + 1));
    r = p && report_error_(b, Widget(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // WindowProp*
  private static boolean WindowDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WindowDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!WindowProp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WindowDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // MonitorProp | WmIgnoreProp
  public static boolean WindowProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WindowProp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WINDOW_PROP, "<window prop>");
    r = MonitorProp(b, l + 1);
    if (!r) r = WmIgnoreProp(b, l + 1);
    exit_section_(b, l, m, r, false, YuckParser::PropValueRecover);
    return r;
  }

  /* ********************************************************** */
  // WMIGNOREPROP (true  | false)
  public static boolean WmIgnoreProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WmIgnoreProp")) return false;
    if (!nextTokenIs(b, WMIGNOREPROP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WM_IGNORE_PROP, null);
    r = consumeToken(b, WMIGNOREPROP);
    p = r; // pin = 1
    r = r && WmIgnoreProp_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // true  | false
  private static boolean WmIgnoreProp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WmIgnoreProp_1")) return false;
    boolean r;
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    return r;
  }

}
