// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.h3rmt.intellijyuck.stubs.YuckElementTypeFactory;
import com.github.h3rmt.intellijyuck.psi.impl.*;

public interface YuckTypes {

  IElementType ACTIVE_PROP = new YuckElementType("ACTIVE_PROP");
  IElementType BOX_DEFINITION = new YuckElementType("BOX_DEFINITION");
  IElementType CLASS_PROP = new YuckElementType("CLASS_PROP");
  IElementType COMBO_BOX_TEXT_DEFINITION = new YuckElementType("COMBO_BOX_TEXT_DEFINITION");
  IElementType CSS_PROP = new YuckElementType("CSS_PROP");
  IElementType CUSTOM_WIDGET_DEFINITION = YuckElementTypeFactory.stubFactory("CUSTOM_WIDGET_DEFINITION");
  IElementType CUSTOM_WIDGET_DEFINITION_BRACKETS = new YuckElementType("CUSTOM_WIDGET_DEFINITION_BRACKETS");
  IElementType CUSTOM_WIDGET_REFERENCE = new YuckElementType("CUSTOM_WIDGET_REFERENCE");
  IElementType EXPANDER_DEFINITION = new YuckElementType("EXPANDER_DEFINITION");
  IElementType EXPAND_PROP = new YuckElementType("EXPAND_PROP");
  IElementType HALIGN_PROP = new YuckElementType("HALIGN_PROP");
  IElementType HEIGHT_PROP = new YuckElementType("HEIGHT_PROP");
  IElementType HEXPAND_PROP = new YuckElementType("HEXPAND_PROP");
  IElementType MONITOR_PROP = new YuckElementType("MONITOR_PROP");
  IElementType NAME_PROP = new YuckElementType("NAME_PROP");
  IElementType ON_CHANGE_PROP = new YuckElementType("ON_CHANGE_PROP");
  IElementType ORIENTATION_PROP = new YuckElementType("ORIENTATION_PROP");
  IElementType SPACE_EVENLY_PROP = new YuckElementType("SPACE_EVENLY_PROP");
  IElementType SPACING_PROP = new YuckElementType("SPACING_PROP");
  IElementType STYLE_PROP = new YuckElementType("STYLE_PROP");
  IElementType TIMEOUT_PROP = new YuckElementType("TIMEOUT_PROP");
  IElementType TOOLTIP_PROP = new YuckElementType("TOOLTIP_PROP");
  IElementType VALIGN_PROP = new YuckElementType("VALIGN_PROP");
  IElementType VEXPAND_PROP = new YuckElementType("VEXPAND_PROP");
  IElementType VISIBLE_PROP = new YuckElementType("VISIBLE_PROP");
  IElementType WIDTH_PROP = new YuckElementType("WIDTH_PROP");
  IElementType WINDOW_DEFINITION = YuckElementTypeFactory.stubFactory("WINDOW_DEFINITION");
  IElementType WINDOW_PROP = new YuckElementType("WINDOW_PROP");
  IElementType WM_IGNORE_PROP = new YuckElementType("WM_IGNORE_PROP");

  IElementType ACTIVEPROP = new YuckTokenType(":active");
  IElementType BOX = new YuckTokenType("box");
  IElementType CLASSPROP = new YuckTokenType(":class");
  IElementType COMBOBOXTEXT = new YuckTokenType("combo-box-text");
  IElementType CSSPROP = new YuckTokenType(":css");
  IElementType DEFWIDGET = new YuckTokenType("defwidget");
  IElementType DEFWINDOW = new YuckTokenType("defwindow");
  IElementType DOUBLE_QUOTE = new YuckTokenType("\"");
  IElementType EXPANDEDPROP = new YuckTokenType(":expanded");
  IElementType EXPANDER = new YuckTokenType("expander");
  IElementType FALSE = new YuckTokenType("false");
  IElementType FLOAT = new YuckTokenType("float");
  IElementType HALIGNPROP = new YuckTokenType(":halign");
  IElementType HEIGHTPROP = new YuckTokenType(":height");
  IElementType HEXPANDPROP = new YuckTokenType(":hexpand");
  IElementType IDENTIFIER = new YuckTokenType("identifier");
  IElementType INT = new YuckTokenType("int");
  IElementType LBRACKET = new YuckTokenType("[");
  IElementType LPAREN = new YuckTokenType("(");
  IElementType MONITORPROP = new YuckTokenType(":monitor");
  IElementType NAMEPROP = new YuckTokenType(":name");
  IElementType ONCHANGEPROP = new YuckTokenType(":onchange");
  IElementType ORIENTATIONPROP = new YuckTokenType(":orientation");
  IElementType RBRACKET = new YuckTokenType("]");
  IElementType RPAREN = new YuckTokenType(")");
  IElementType SINGLE_QUOTE = new YuckTokenType("'");
  IElementType SPACEEVENLYPROP = new YuckTokenType(":space-evenly");
  IElementType SPACINGPROP = new YuckTokenType(":spacing");
  IElementType STRING = new YuckTokenType("string");
  IElementType STYLEPROP = new YuckTokenType(":style");
  IElementType TIMEOUTPROP = new YuckTokenType(":timeout");
  IElementType TOOLTIPPROP = new YuckTokenType(":tooltip");
  IElementType TRUE = new YuckTokenType("true");
  IElementType VALIGNPROP = new YuckTokenType(":valign");
  IElementType VEXPANDPROP = new YuckTokenType(":vexpand");
  IElementType VISIBLEPROP = new YuckTokenType(":visible");
  IElementType WIDTHPROP = new YuckTokenType(":width");
  IElementType WMIGNOREPROP = new YuckTokenType(":wm-ignore");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACTIVE_PROP) {
        return new YuckActivePropImpl(node);
      }
      else if (type == BOX_DEFINITION) {
        return new YuckBoxDefinitionImpl(node);
      }
      else if (type == CLASS_PROP) {
        return new YuckClassPropImpl(node);
      }
      else if (type == COMBO_BOX_TEXT_DEFINITION) {
        return new YuckComboBoxTextDefinitionImpl(node);
      }
      else if (type == CSS_PROP) {
        return new YuckCssPropImpl(node);
      }
      else if (type == CUSTOM_WIDGET_DEFINITION) {
        return new YuckCustomWidgetDefinitionImpl(node);
      }
      else if (type == CUSTOM_WIDGET_DEFINITION_BRACKETS) {
        return new YuckCustomWidgetDefinitionBracketsImpl(node);
      }
      else if (type == CUSTOM_WIDGET_REFERENCE) {
        return new YuckCustomWidgetReferenceImpl(node);
      }
      else if (type == EXPANDER_DEFINITION) {
        return new YuckExpanderDefinitionImpl(node);
      }
      else if (type == EXPAND_PROP) {
        return new YuckExpandPropImpl(node);
      }
      else if (type == HALIGN_PROP) {
        return new YuckHalignPropImpl(node);
      }
      else if (type == HEIGHT_PROP) {
        return new YuckHeightPropImpl(node);
      }
      else if (type == HEXPAND_PROP) {
        return new YuckHexpandPropImpl(node);
      }
      else if (type == MONITOR_PROP) {
        return new YuckMonitorPropImpl(node);
      }
      else if (type == NAME_PROP) {
        return new YuckNamePropImpl(node);
      }
      else if (type == ON_CHANGE_PROP) {
        return new YuckOnChangePropImpl(node);
      }
      else if (type == ORIENTATION_PROP) {
        return new YuckOrientationPropImpl(node);
      }
      else if (type == SPACE_EVENLY_PROP) {
        return new YuckSpaceEvenlyPropImpl(node);
      }
      else if (type == SPACING_PROP) {
        return new YuckSpacingPropImpl(node);
      }
      else if (type == STYLE_PROP) {
        return new YuckStylePropImpl(node);
      }
      else if (type == TIMEOUT_PROP) {
        return new YuckTimeoutPropImpl(node);
      }
      else if (type == TOOLTIP_PROP) {
        return new YuckTooltipPropImpl(node);
      }
      else if (type == VALIGN_PROP) {
        return new YuckValignPropImpl(node);
      }
      else if (type == VEXPAND_PROP) {
        return new YuckVexpandPropImpl(node);
      }
      else if (type == VISIBLE_PROP) {
        return new YuckVisiblePropImpl(node);
      }
      else if (type == WIDTH_PROP) {
        return new YuckWidthPropImpl(node);
      }
      else if (type == WINDOW_DEFINITION) {
        return new YuckWindowDefinitionImpl(node);
      }
      else if (type == WINDOW_PROP) {
        return new YuckWindowPropImpl(node);
      }
      else if (type == WM_IGNORE_PROP) {
        return new YuckWmIgnorePropImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
