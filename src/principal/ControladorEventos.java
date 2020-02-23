/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
/**
 *
 * @author ivan
 */
public class ControladorEventos implements ActionListener{
    
    Lamina lamina;
    Marco marco;
    
        public void actionPerformed(ActionEvent e) {
            
            int tamanyoletra = (int) lamina.tamanyo.getSelectedItem();
            String fuente = (String) lamina.tipoLetras.getSelectedItem();
            
            String etiqueta_color_chooser=ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_color");

            String etiqueta_salir_titulo=ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_salir_titulo");
            String etiqueta_salir_contenido=ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_salir_contenido");

            String etiqueta_info_titulo=ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_info_titulo");
            String etiqueta_info_contenido=ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_info_contenido");

            
          //Barra de herramientas
          if(e.getSource()==lamina.tamanyo){
              
              new StyledEditorKit.FontSizeAction("tamaño",tamanyoletra).actionPerformed(e);
              
              //comprobamos cual ha sido seleccionado del combobox y marcamos la casilla del submenu correspondiente
              if(tamanyoletra==10){
                  lamina.submenu_10.setSelected(true);
              }else if(tamanyoletra==14){
                  lamina.submenu_14.setSelected(true);
              }else if(tamanyoletra==18){
                  lamina.submenu_18.setSelected(true);
              }else if(tamanyoletra==22){
                  lamina.submenu_22.setSelected(true);
              }
             
          }else if(e.getSource()==lamina.tipoLetras){
              
              new StyledEditorKit.FontFamilyAction("estilo", fuente).actionPerformed(e);
              
              //comprobamos que fuente ha sido seleccionada del combobox y marcamos la casilla del submenu correspondiente
              if(fuente.equals("Arial")){
                  lamina.submenu_arial.setSelected(true);
              }else if(fuente.equals("Verdana")){
                  lamina.submenu_verdana.setSelected(true);
              }else if(fuente.equals("Courier")){
                  lamina.submenu_courier.setSelected(true);
              }else if(fuente.equals("Impact")){
                  lamina.submenu_impact.setSelected(true);
              }
              
              
          }else if(e.getSource()==lamina.negrita || e.getSource()==lamina.contextual_negrita){
              
              new StyledEditorKit.BoldAction().actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual de la negrita el botón de la barra se quede pulsado
              if(lamina.negrita.isSelected()==false){
                  lamina.negrita.setSelected(true);
                  
              } else if(lamina.negrita.isSelected()==true){
                  lamina.negrita.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_negrita.isSelected()==false){
                  lamina.submenu_negrita.setSelected(true);
                  
              } else if(lamina.submenu_negrita.isSelected()==true){
                  lamina.submenu_negrita.setSelected(false);
              }
              
             
          }else if(e.getSource()==lamina.cursiva || e.getSource()==lamina.contextual_cursiva){
              
              new StyledEditorKit.ItalicAction().actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual de la cursiva el botón de la barra se quede pulsado
              if(lamina.cursiva.isSelected()==false){
                  lamina.cursiva.setSelected(true);
                  
              } else if(lamina.cursiva.isSelected()==true){
                  lamina.cursiva.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_cursiva.isSelected()==false){
                  lamina.submenu_cursiva.setSelected(true);
                  
              } else if(lamina.submenu_cursiva.isSelected()==true){
                  lamina.submenu_cursiva.setSelected(false);
              }
              
          }else if(e.getSource()==lamina.subrayado || e.getSource()==lamina.contextual_subrayado){
         
              new StyledEditorKit.UnderlineAction().actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual del subrayado el botón de la barra se quede pulsado
              if(lamina.subrayado.isSelected()==false){
                  lamina.subrayado.setSelected(true);
                  
              } else if(lamina.subrayado.isSelected()==true){
                  lamina.subrayado.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_subrayado.isSelected()==false){
                  lamina.submenu_subrayado.setSelected(true);
                  
              } else if(lamina.submenu_subrayado.isSelected()==true){
                  lamina.submenu_subrayado.setSelected(false);
              }
  
          }
          
          else if(e.getSource()==lamina.text_aling_center || e.getSource()==lamina.contextual_centrado || e.getSource()==lamina.submenu_centrado){
              
              new StyledEditorKit.AlignmentAction("Centrado", StyleConstants.ALIGN_CENTER).actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual o el submenu del centrado el botón de la barra se quede pulsado
              if(lamina.text_aling_center.isSelected()==false){
                  lamina.text_aling_center.setSelected(true);
                  
              } else if(lamina.text_aling_center.isSelected()==true){
                  lamina.text_aling_center.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_centrado.isSelected()==false){
                  lamina.submenu_centrado.setSelected(true);
                  
              } else if(lamina.submenu_centrado.isSelected()==true){
                  lamina.submenu_centrado.setSelected(false);
              }
              
              //para que se desseleccionen los demás botones de centrado, ya que solo uno puede estar activado a la vez
              lamina.text_aling_left.setSelected(false);
              lamina.text_aling_right.setSelected(false);
              lamina.text_aling_full.setSelected(false);
              
          }else if(e.getSource()==lamina.text_aling_left || e.getSource()==lamina.contextual_izquierda || e.getSource()==lamina.submenu_izquierda){
              
              new StyledEditorKit.AlignmentAction("Izquierda", StyleConstants.ALIGN_LEFT).actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual o el submenu del centrado izquierdo el botón de la barra se quede pulsado
              if(lamina.text_aling_left.isSelected()==false){
                  lamina.text_aling_left.setSelected(true);
                  
              } else if(lamina.text_aling_left.isSelected()==true){
                  lamina.text_aling_left.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_izquierda.isSelected()==false){
                  lamina.submenu_izquierda.setSelected(true);
                  
              } else if(lamina.submenu_izquierda.isSelected()==true){
                  lamina.submenu_izquierda.setSelected(false);
              }
              
              //para que se desseleccionen los demás botones de centrado, ya que solo uno puede estar activado a la vez
              lamina.text_aling_center.setSelected(false);
              lamina.text_aling_right.setSelected(false);
              lamina.text_aling_full.setSelected(false);
             
          }else if(e.getSource()==lamina.text_aling_right || e.getSource()==lamina.contextual_derecha || e.getSource()==lamina.submenu_derecha){
         
              new StyledEditorKit.AlignmentAction("Derecha", StyleConstants.ALIGN_RIGHT).actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual o el submenu del centrado derecho el botón de la barra se quede pulsado
              if(lamina.text_aling_right.isSelected()==false){
                  lamina.text_aling_right.setSelected(true);
                  
              } else if(lamina.text_aling_right.isSelected()==true){
                  lamina.text_aling_right.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_derecha.isSelected()==false){
                  lamina.submenu_derecha.setSelected(true);
                  
              } else if(lamina.submenu_derecha.isSelected()==true){
                  lamina.submenu_derecha.setSelected(false);
              }
              
              //para que se desseleccionen los demás botones de centrado, ya que solo uno puede estar activado a la vez
              lamina.text_aling_center.setSelected(false);
              lamina.text_aling_left.setSelected(false);
              lamina.text_aling_full.setSelected(false);
              
          }else if(e.getSource()==lamina.text_aling_full || e.getSource()==lamina.contextual_justificado || e.getSource()==lamina.submenu_justificado){
              
              new StyledEditorKit.AlignmentAction("Justificado", StyleConstants.ALIGN_JUSTIFIED).actionPerformed(e);
              
              //comprobamos que cuando se haga click en el menu contextual o el submenu del justificado el botón de la barra se quede pulsado
              if(lamina.text_aling_full.isSelected()==false){
                  lamina.text_aling_full.setSelected(true);
                  
              } else if(lamina.text_aling_full.isSelected()==true){
                  lamina.text_aling_full.setSelected(false);
              }
              
              //comprobamos para que cuando se haga click en el boton de la barra y del menú contextual se seleccione a su vez en el checkbox
              if(lamina.submenu_justificado.isSelected()==false){
                  lamina.submenu_justificado.setSelected(true);
                  
              } else if(lamina.submenu_justificado.isSelected()==true){
                  lamina.submenu_justificado.setSelected(false);
              }
              
              //para que se desseleccionen los demás botones de centrado, ya que solo uno puede estar activado a la vez
              lamina.text_aling_center.setSelected(false);
              lamina.text_aling_left.setSelected(false);
              lamina.text_aling_right.setSelected(false);
             
          }else if(e.getSource()==lamina.colores_fuente || e.getSource()==lamina.submenu_color){
         
              //todas estas etiquetas son para cambiar el texto de cada uno de los componentes del ColorChooser
              UIManager.put("ColorChooser.okText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_aceptar")));
              UIManager.put("ColorChooser.cancelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cancelar")));
              UIManager.put("ColorChooser.resetText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_restablecer")));
              UIManager.put("ColorChooser.sampleText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_textoEjemplo")));
              UIManager.put("ColorChooser.swatchesNameText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_muestras")));
              UIManager.put("ColorChooser.swatchesRecentText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_reciente")));
              UIManager.put("ColorChooser.previewText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_vistaPrevia")));
              
              UIManager.put("ColorChooser.hslHueText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_matiz")));
              UIManager.put("ColorChooser.hslSaturationText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_saturacion")));
              UIManager.put("ColorChooser.hslTransparencyText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_transparencia")));
              UIManager.put("ColorChooser.hslBrightnessText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_vistaPrevia")));
              
              UIManager.put("ColorChooser.hsvHueText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_matiz")));
              UIManager.put("ColorChooser.hsvSaturationText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_saturacion")));
              UIManager.put("ColorChooser.hsvValueText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_valor")));
              UIManager.put("ColorChooser.hsvTransparencyText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_transparencia")));
              
              UIManager.put("ColorChooser.rgbBlueText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_azul")));
              UIManager.put("ColorChooser.rgbGreenText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_verde")));
              UIManager.put("ColorChooser.rgbRedText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_rojo")));
              UIManager.put("ColorChooser.rgbAlphaText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_alfa")));
              
              UIManager.put("ColorChooser.cmykCyanText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cian")));
              UIManager.put("ColorChooser.cmykMagentaText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_magenta")));
              UIManager.put("ColorChooser.cmykYellowText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_amarillo")));
              UIManager.put("ColorChooser.cmykBlackText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_negro")));
              UIManager.put("ColorChooser.cmykAlphaText", (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_alfa")));
              
              JColorChooser menu_colores=new JColorChooser();
              Color color;
              
              color=menu_colores.showDialog(null,etiqueta_color_chooser,Color.BLACK);
              
              new StyledEditorKit.ForegroundAction("Color fuente", color) .actionPerformed(e);
              
          }else if(e.getSource()==lamina.abrir || e.getSource()==lamina.submenu_abrir){
         
              //todas estas etiquetas son para cambiar el texto de cada uno de los componentes del FileChooser
              UIManager.put("FileChooser.openButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_abrir")));
              UIManager.put("FileChooser.cancelButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cancelar")));
              UIManager.put("FileChooser.filesOfTypeLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_formato_arch")));
              UIManager.put("FileChooser.byNameText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre")));
              UIManager.put("FileChooser.byDateText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_fechaMod")));
              UIManager.put("FileChooser.fileNameLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre_arch")));
              UIManager.put("FileChooser.lookInLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_buscar_en")));
              
              UIManager.put("FileChooser.upFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_upFolder")));
              UIManager.put("FileChooser.homeFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_homeFolder")));
              UIManager.put("FileChooser.newFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_newFolder")));
              UIManager.put("FileChooser.listViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_listView")));
              UIManager.put("FileChooser.detailsViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_detailView")));
              UIManager.put("FileChooser.openButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_open")));
              UIManager.put("FileChooser.cancelButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_cancel")));
              
              JFileChooser explorador = new JFileChooser();
              explorador.setDialogTitle((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_vent_abrir")));
              explorador.setCurrentDirectory(new File(explorador.getCurrentDirectory() + "/Desktop"));
              FileNameExtensionFilter filter1=new FileNameExtensionFilter((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_filtro_txt")),"txt","rtf");
              FileNameExtensionFilter filter3=new FileNameExtensionFilter((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_filtro_odt")),"odt");
              FileNameExtensionFilter filter2=new FileNameExtensionFilter((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_filtro_doc")),"doc","docx");
              FileNameExtensionFilter filter4=new FileNameExtensionFilter((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_filtro_web")),"html","xhtml","htm");
              explorador.addChoosableFileFilter(filter1);
              explorador.addChoosableFileFilter(filter2);
              explorador.addChoosableFileFilter(filter3);
              explorador.addChoosableFileFilter(filter4);
              explorador.setAcceptAllFileFilterUsed(false);
              
              if (JFileChooser.APPROVE_OPTION == explorador.showOpenDialog(lamina.tp)) {
              String fichero = explorador.getSelectedFile().getPath();
              
              try{
                BufferedReader reader = new BufferedReader(new FileReader(fichero));
                String linea;
                String textoTotal="";
                while((linea=reader.readLine()) != null){
                        
                        textoTotal=textoTotal + linea + "\n";
                        
                        lamina.tp.setText(textoTotal);
                }
                reader.close();
                
              }catch (Exception e1){System.out.println(e1.getMessage());}
              
              }
              
          }else if(e.getSource()==lamina.guardar || e.getSource()==lamina.submenu_guardar){
              
              //todas estas etiquetas son para cambiar el texto de cada uno de los componentes del FileChooser
              UIManager.put("FileChooser.saveButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_guardar")));
              UIManager.put("FileChooser.cancelButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cancelar")));
              UIManager.put("FileChooser.newFolderButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nuevaCarpeta")));
              UIManager.put("FileChooser.acceptAllFileFilterText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_sinFiltro")));
              UIManager.put("FileChooser.filesOfTypeLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_formato_arch")));
              UIManager.put("FileChooser.byNameText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre")));
              UIManager.put("FileChooser.byDateText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_fechaMod")));
              UIManager.put("FileChooser.fileNameLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre_arch")));
              UIManager.put("FileChooser.saveInLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_guardar_en")));
              
              UIManager.put("FileChooser.upFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_upFolder")));
              UIManager.put("FileChooser.homeFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_homeFolder")));
              UIManager.put("FileChooser.newFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_newFolder")));
              UIManager.put("FileChooser.listViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_listView")));
              UIManager.put("FileChooser.detailsViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_detailView")));
              UIManager.put("FileChooser.saveButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_save")));
              UIManager.put("FileChooser.cancelButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_cancel")));
              
              JFileChooser explorador = new JFileChooser();
              explorador.setCurrentDirectory(new File(explorador.getCurrentDirectory() + "/Desktop"));
              explorador.setDialogTitle((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_vent_guardar")));
              
              if (JFileChooser.APPROVE_OPTION == explorador.showSaveDialog(lamina.tp)){
              String fichero = explorador.getSelectedFile().getAbsolutePath()+ ".txt";
              
              try
              {
                PrintWriter writer = new PrintWriter(fichero);
                writer.print(lamina.tp.getText());
                writer.close();
              }catch (Exception e2){System.out.println(e2.getMessage());}
              
            }
           
          }else if(e.getSource()==lamina.salir || e.getSource()==lamina.submenu_salir){
         
              JOptionPane panelSalir=new JOptionPane();
              String boton1 = (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_salir"));
              String boton2 = (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cancelar"));
              String botones[] = {boton1,boton2};
              
              int select =panelSalir.showOptionDialog(null, etiqueta_salir_contenido, etiqueta_salir_titulo,
                      JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones[0]);
              if (select == JOptionPane.OK_OPTION){
                System.exit(0);
              }
          }else if(e.getSource()==lamina.imagen){
         
              //todas estas etiquetas son para cambiar el texto de cada uno de los componentes del FileChooser
              UIManager.put("FileChooser.openButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_abrir")));
              UIManager.put("FileChooser.cancelButtonText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cancelar")));
              UIManager.put("FileChooser.filesOfTypeLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_formato_arch")));
              UIManager.put("FileChooser.byNameText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre")));
              UIManager.put("FileChooser.byDateText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_fechaMod")));
              UIManager.put("FileChooser.fileNameLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_nombre_arch")));
              UIManager.put("FileChooser.lookInLabelText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_buscar_en")));
              
              UIManager.put("FileChooser.upFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_upFolder")));
              UIManager.put("FileChooser.homeFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_homeFolder")));
              UIManager.put("FileChooser.newFolderToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_newFolder")));
              UIManager.put("FileChooser.listViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_listView")));
              UIManager.put("FileChooser.detailsViewButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_detailView")));
              UIManager.put("FileChooser.openButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_open")));
              UIManager.put("FileChooser.cancelButtonToolTipText",(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_tipText_cancel")));
               
              JFileChooser explorador = new JFileChooser();
              explorador.setDialogTitle((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_vent_imagen")));
              explorador.setCurrentDirectory(new File(explorador.getCurrentDirectory() + "/Desktop"));
              FileNameExtensionFilter filter1=new FileNameExtensionFilter((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_filtro_imagen")),"png","jpg");
              explorador.addChoosableFileFilter(filter1);
              explorador.setAcceptAllFileFilterUsed(false);
              
              if (JFileChooser.APPROVE_OPTION == explorador.showOpenDialog(lamina.tp)) {
              String imagen = explorador.getSelectedFile().getPath();
              
              lamina.tp.insertIcon(new ImageIcon(imagen));
              }
                
          }else if(e.getSource()==lamina.deshacer || e.getSource()==lamina.submenu_deshacer){
              
              lamina.undoManager.undo();
                
          }else if(e.getSource()==lamina.rehacer || e.getSource()==lamina.submenu_rehacer){
              
              lamina.undoManager.redo();
                
          }
          
          
          
          
          //Menú
          else if(e.getSource()==lamina.submenu_10){
              
              new StyledEditorKit.FontSizeAction("estilo", 10).actionPerformed(e);
               lamina.tamanyo.setSelectedItem(10);
               
          }else if(e.getSource()==lamina.submenu_14){
              
              new StyledEditorKit.FontSizeAction("estilo", 14).actionPerformed(e);
               lamina.tamanyo.setSelectedItem(14);
              
          }else if(e.getSource()==lamina.submenu_18){
              
              new StyledEditorKit.FontSizeAction("estilo", 18).actionPerformed(e);
               lamina.tamanyo.setSelectedItem(18);
              
          }else if(e.getSource()==lamina.submenu_22){
              
              new StyledEditorKit.FontSizeAction("estilo", 22).actionPerformed(e);
               lamina.tamanyo.setSelectedItem(22);
              
          }else if(e.getSource()==lamina.submenu_arial){
              
              new StyledEditorKit.FontFamilyAction("estilo", "Arial").actionPerformed(e);
              lamina.tipoLetras.setSelectedItem("Arial");
              
          }else if(e.getSource()==lamina.submenu_verdana){
              
              new StyledEditorKit.FontFamilyAction("estilo", "Verdana").actionPerformed(e);
              lamina.tipoLetras.setSelectedItem("Verdana");
              
          }else if(e.getSource()==lamina.submenu_courier){
              
              new StyledEditorKit.FontFamilyAction("estilo", "Courier").actionPerformed(e);
              lamina.tipoLetras.setSelectedItem("Courier");
              
          }else if(e.getSource()==lamina.submenu_impact){
              
              new StyledEditorKit.FontFamilyAction("estilo", "Impact").actionPerformed(e);
              lamina.tipoLetras.setSelectedItem("Impact");
              
          }else if(e.getSource()==lamina.submenu_negrita){
              
              new StyledEditorKit.BoldAction().actionPerformed(e);
              
              if(lamina.negrita.isSelected()==false){
                  lamina.negrita.setSelected(true);
                  
              } else if(lamina.negrita.isSelected()==true){
                  lamina.negrita.setSelected(false);
              }
              
          }else if(e.getSource()==lamina.submenu_cursiva){
              
              new StyledEditorKit.ItalicAction().actionPerformed(e);
              
              if(lamina.cursiva.isSelected()==false){
                  lamina.cursiva.setSelected(true);
                  
              } else if(lamina.cursiva.isSelected()==true){
                  lamina.cursiva.setSelected(false);
              }
              
          }else if(e.getSource()==lamina.submenu_subrayado){
              
              new StyledEditorKit.UnderlineAction().actionPerformed(e);
              
              if(lamina.subrayado.isSelected()==false){
                  lamina.subrayado.setSelected(true);
                  
              } else if(lamina.subrayado.isSelected()==true){
                  lamina.subrayado.setSelected(false);
              }
              
          }else if(e.getSource()==lamina.submenu_español){
              
             Locale.setDefault(new Locale("es"));
             lamina.cambiarIdioma();
              
          }else if(e.getSource()==lamina.submenu_ingles){
              
              Locale.setDefault(Locale.ENGLISH);
              lamina.cambiarIdioma();
              
          }else if(e.getSource()==lamina.submenu_frances){
              
              Locale.setDefault(Locale.FRENCH);
              lamina.cambiarIdioma();
          }else if(e.getSource()==lamina.submenu_informacion){
         
              JOptionPane panelInfo=new JOptionPane();
              String boton1 = (ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_aceptar"));
              String botones[] = {boton1};
              
              panelInfo.showOptionDialog(null, etiqueta_info_contenido, etiqueta_info_titulo, 
                      JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null/*icono*/, botones, botones[0]);
              
          }else if(e.getSource()==lamina.submenu_copiar || e.getSource()==lamina.contextual_copiar || e.getSource()==lamina.copiar ){
         
            new DefaultEditorKit.CopyAction().actionPerformed(e);
             
            /*
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection texto = new StringSelection(lamina.tp.getSelectedText());
            cb.setContents(texto, texto);
            */
            
          }else if(e.getSource()==lamina.submenu_cortar || e.getSource()==lamina.contextual_cortar || e.getSource()==lamina.cortar ){
         
            new DefaultEditorKit.CutAction().actionPerformed(e);
            
            /*
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection texto = new StringSelection(lamina.tp.getSelectedText());
            cb.setContents(texto, texto);
            */
            
          }else if(e.getSource()==lamina.submenu_pegar || e.getSource()==lamina.contextual_pegar || e.getSource()==lamina.pegar ){
         
              new DefaultEditorKit.PasteAction().actionPerformed(e);
              
              /*
              // Se obtenemos el Clipboard y su contenido
              Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
              Transferable t = cb.getContents(this);

              // Construimos el DataFlavor correspondiente a String.
              DataFlavor dataFlavorStringJava;
                try {
                    dataFlavorStringJava = new DataFlavor("application/x-java-serialized-object; class=java.lang.String");
                    
                    // Si el dato es un String lo seteamos por pantalla
                     if (t.isDataFlavorSupported(dataFlavorStringJava)) {
                        String texto = lamina.tp.getText() + (String) t.getTransferData(dataFlavorStringJava);
                        lamina.tp.setText(texto);
                    }
                     
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControladorEventos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedFlavorException ex) {
                    Logger.getLogger(ControladorEventos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ControladorEventos.class.getName()).log(Level.SEVERE, null, ex);
                }
                */
    
          }else if(e.getSource()==lamina.submenu_skin_default){
         
            try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            for(Window window : marco.getWindows()) {SwingUtilities.updateComponentTreeUI(window);}
            }catch (Exception ex) {}
              
          }else if(e.getSource()==lamina.submenu_skin_dark){
              
            try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            for(Window window : marco.getWindows()) {SwingUtilities.updateComponentTreeUI(window);}
            }catch (Exception ex) {}
           
          }else if(e.getSource()==lamina.submenu_skin_simple){
            
            try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            for(Window window : marco.getWindows()) {SwingUtilities.updateComponentTreeUI(window);}
            }catch (Exception ex) {}
            
        
          }else if(e.getSource()==lamina.submenu_skin_mint){
         
            try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            for(Window window : marco.getWindows()) {SwingUtilities.updateComponentTreeUI(window);}
            }catch (Exception ex) {}
            
          }
          
        }
    
}
