/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.undo.UndoManager;

/**
 *
 * @author ivan
 */
public class Lamina extends JPanel{
        
        UndoManager undoManager = new UndoManager();
        
        ImageIcon icon_negrita=new ImageIcon("src/imagenes/negrita_flaticon.png");
        ImageIcon icon_cursiva=new ImageIcon("src/imagenes/cursiva_flaticon.png");
        ImageIcon icon_subrayado=new ImageIcon("src/imagenes/subrayado_flaticon.png");
        ImageIcon icon_text_aling_center=new ImageIcon("src/imagenes/iconfinder_text_align_center.png");
        ImageIcon icon_text_aling_full=new ImageIcon("src/imagenes/iconfinder_text_align_full.png");
        ImageIcon icon_text_aling_left=new ImageIcon("src/imagenes/iconfinder_text_align_left.png");
        ImageIcon icon_text_aling_right=new ImageIcon("src/imagenes/iconfinder_text_align_right.png");
        ImageIcon icon_color_texto=new ImageIcon("src/imagenes/iconfinder_color_texto.png");
        ImageIcon icon_españa=new ImageIcon("src/imagenes/españa.png");
        ImageIcon icon_francia=new ImageIcon("src/imagenes/francia.png");
        ImageIcon icon_uk=new ImageIcon("src/imagenes/uk.png");
        ImageIcon icon_abrir=new ImageIcon("src/imagenes/abrir_flaticon.png");
        ImageIcon icon_guardar=new ImageIcon("src/imagenes/guardar_flaticon.png");
        ImageIcon icon_salir=new ImageIcon("src/imagenes/salir_flaticon.png");
        ImageIcon icon_abrir_submenu=new ImageIcon("src/imagenes/abrir_submenu_flaticon.png");
        ImageIcon icon_guardar_submenu=new ImageIcon("src/imagenes/guardar_submenu_flaticon.png");
        ImageIcon icon_salir_submenu=new ImageIcon("src/imagenes/salir_submenu_flaticon.png");
        ImageIcon icon_imagen=new ImageIcon("src/imagenes/imagen_flaticon.png");
        ImageIcon icon_deshacer=new ImageIcon("src/imagenes/deshacer_flaticon.png");
        ImageIcon icon_rehacer=new ImageIcon("src/imagenes/rehacer_flaticon.png");
        ImageIcon icon_copiar=new ImageIcon("src/imagenes/copiar_flaticon.png");
        ImageIcon icon_cortar=new ImageIcon("src/imagenes/cortar_flaticon.png");
        ImageIcon icon_pegar=new ImageIcon("src/imagenes/pegar_flaticon.png");
        
        //JLabel textoLetras=new JLabel("Fuente:");
        JComboBox tipoLetras=new JComboBox();
        JTextPane tp=new JTextPane();
        JScrollPane sp=new JScrollPane(tp);
        JTabbedPane pestañas=new JTabbedPane();
        JToolBar barra=new JToolBar();
        JToolBar barra2=new JToolBar();
        JToolBar barra3=new JToolBar();
        
        
        JButton abrir=new JButton(icon_abrir);
        JButton guardar=new JButton(icon_guardar);
        JButton salir=new JButton(icon_salir);
        JButton imagen=new JButton(icon_imagen);
        JButton negrita=new JButton(icon_negrita);
        JButton cursiva=new JButton(icon_cursiva);
        JButton subrayado=new JButton(icon_subrayado);
        JButton text_aling_center=new JButton(icon_text_aling_center);
        JButton text_aling_full=new JButton(icon_text_aling_full);
        JButton text_aling_left=new JButton(icon_text_aling_left);
        JButton text_aling_right=new JButton(icon_text_aling_right);
        JButton colores_fuente=new JButton(icon_color_texto);
        JButton deshacer=new JButton(icon_deshacer);
        JButton rehacer=new JButton(icon_rehacer);
        JButton copiar=new JButton(icon_copiar);
        JButton cortar=new JButton(icon_cortar);
        JButton pegar=new JButton(icon_pegar);
        
        //JLabel textoTamanyo=new JLabel("  "+"Tamaño:");
        JComboBox tamanyo=new JComboBox();
        JMenuBar barraMenu=new JMenuBar();
        
        JPopupMenu menu_contextual=new JPopupMenu();
        JMenuItem contextual_copiar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_copiar"));
        JMenuItem contextual_cortar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cortar"));
        JMenuItem contextual_pegar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pegar"));
        JMenuItem contextual_negrita=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_negrita"),icon_negrita);
        JMenuItem contextual_cursiva=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cursiva"),icon_cursiva);
        JMenuItem contextual_subrayado=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_subrayado"),icon_subrayado);
        JMenuItem contextual_centrado=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_centrado"),icon_text_aling_center);
        JMenuItem contextual_justificado=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_justificado"),icon_text_aling_full);
        JMenuItem contextual_izquierda=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_izquierda"),icon_text_aling_left);
        JMenuItem contextual_derecha=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_derecha"),icon_text_aling_right);
        
        
        JMenu menu_archivo=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_archivo"));
        JMenuItem submenu_abrir=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_abrir"),icon_abrir_submenu);
        JMenuItem submenu_guardar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_guardar"),icon_guardar_submenu);
        JMenuItem submenu_salir=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_salir"),icon_salir_submenu);
           
         JMenu menu_edicion=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_edicion"));
         JMenuItem submenu_deshacer=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_deshacer"));
         JMenuItem submenu_rehacer=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_rehacer"));
         JMenuItem submenu_copiar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_copiar"));
         JMenuItem submenu_cortar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cortar"));
         JMenuItem submenu_pegar=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pegar"));
          
          ButtonGroup grupoFuente=new ButtonGroup();
          JMenu menu_fuente=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_fuente"));
          JRadioButtonMenuItem submenu_arial=new JRadioButtonMenuItem("Arial");
          JRadioButtonMenuItem submenu_verdana=new JRadioButtonMenuItem("Verdana");
          JRadioButtonMenuItem submenu_courier=new JRadioButtonMenuItem("Courier");
          JRadioButtonMenuItem submenu_impact=new JRadioButtonMenuItem("Impact");
         
         
           ButtonGroup grupoTamaño=new ButtonGroup();
           JMenu menu_tamaño=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_tamaño"));
           JRadioButtonMenuItem submenu_10=new JRadioButtonMenuItem("10");
           JRadioButtonMenuItem submenu_14=new JRadioButtonMenuItem("14");
           JRadioButtonMenuItem submenu_18=new JRadioButtonMenuItem("18");
           JRadioButtonMenuItem submenu_22=new JRadioButtonMenuItem("22");
           
           
           JMenu menu_estilo=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_estilo"));
           JCheckBoxMenuItem submenu_negrita=new JCheckBoxMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_negrita"),icon_negrita);
           JCheckBoxMenuItem submenu_cursiva=new JCheckBoxMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cursiva"),icon_cursiva);
           JCheckBoxMenuItem submenu_subrayado=new JCheckBoxMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_subrayado"),icon_subrayado);
          
           
            ButtonGroup grupoParrafo=new ButtonGroup();
            JMenu menu_parrafo=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_parrafo"));
            JRadioButtonMenuItem submenu_centrado=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_centrado"),icon_text_aling_center);
            JRadioButtonMenuItem submenu_justificado=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_justificado"),icon_text_aling_full);
            JRadioButtonMenuItem submenu_izquierda=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_izquierda"),icon_text_aling_left);
            JRadioButtonMenuItem submenu_derecha=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_derecha"),icon_text_aling_right);
            
            
            JMenu menu_color=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_color"));
            JMenuItem submenu_color=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_color"),icon_color_texto);
           
            ButtonGroup grupoSkin=new ButtonGroup();
            JMenu menu_skin=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_skin"));
            JRadioButtonMenuItem submenu_skin_default=new JRadioButtonMenuItem((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_default")));
            JRadioButtonMenuItem submenu_skin_dark=new JRadioButtonMenuItem((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_dark")));
            JRadioButtonMenuItem submenu_skin_simple=new JRadioButtonMenuItem((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_simple")));
            JRadioButtonMenuItem submenu_skin_mint=new JRadioButtonMenuItem((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_mint")));
            
            ButtonGroup grupoIdioma=new ButtonGroup();
            JMenu menu_idioma=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_idioma"));
            JRadioButtonMenuItem submenu_español=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_español"),icon_españa);
            JRadioButtonMenuItem submenu_ingles=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_ingles"),icon_uk);
            JRadioButtonMenuItem submenu_frances=new JRadioButtonMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_frances"),icon_francia);
           
            JMenu menu_informacion=new JMenu(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_informacion"));
            JMenuItem submenu_informacion=new JMenuItem(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_inf_acercade"));
          
        public Lamina(){
            
            ControladorEventos ce=new ControladorEventos();
            ce.lamina=this;
            
            setLayout(new BorderLayout());
            
            menu_archivo.add(submenu_abrir);
            menu_archivo.add(submenu_guardar);
            menu_archivo.addSeparator();
            menu_archivo.add(submenu_salir);
            
            menu_edicion.add(submenu_deshacer);
            menu_edicion.add(submenu_rehacer);
            menu_edicion.addSeparator();
            menu_edicion.add(submenu_copiar);
            menu_edicion.add(submenu_cortar);
            menu_edicion.add(submenu_pegar);
            
            grupoFuente.add(submenu_arial);
            grupoFuente.add(submenu_verdana);
            grupoFuente.add(submenu_courier);
            grupoFuente.add(submenu_impact);
            
            menu_fuente.add(submenu_arial);
            menu_fuente.add(submenu_verdana);
            menu_fuente.add(submenu_courier);
            menu_fuente.add(submenu_impact);
            
            menu_estilo.add(submenu_negrita);
            menu_estilo.add(submenu_cursiva);
            menu_estilo.add(submenu_subrayado);
            
            grupoTamaño.add(submenu_10);
            grupoTamaño.add(submenu_14);
            grupoTamaño.add(submenu_18);
            grupoTamaño.add(submenu_22);
            
            menu_tamaño.add(submenu_10);
            menu_tamaño.add(submenu_14);
            menu_tamaño.add(submenu_18);
            menu_tamaño.add(submenu_22);
            
            grupoParrafo.add(submenu_justificado);
            grupoParrafo.add(submenu_izquierda);
            grupoParrafo.add(submenu_centrado);
            grupoParrafo.add(submenu_derecha);
            
            menu_parrafo.add(submenu_justificado);
            menu_parrafo.add(submenu_izquierda);
            menu_parrafo.add(submenu_centrado);
            menu_parrafo.add(submenu_derecha);
            
            menu_color.add(submenu_color);
            
            grupoIdioma.add(submenu_español);
            grupoIdioma.add(submenu_ingles);
            grupoIdioma.add(submenu_frances);
            
            menu_idioma.add(submenu_español);
            menu_idioma.add(submenu_ingles);
            menu_idioma.add(submenu_frances);
            
            grupoSkin.add(submenu_skin_default);
            grupoSkin.add(submenu_skin_dark);
            grupoSkin.add(submenu_skin_simple);
            grupoSkin.add(submenu_skin_mint);
            
            menu_skin.add(submenu_skin_default);
            menu_skin.add(submenu_skin_dark);
            menu_skin.add(submenu_skin_simple);
            menu_skin.add(submenu_skin_mint);
            
            menu_informacion.add(submenu_informacion);
            
            barraMenu.add(menu_archivo);
            barraMenu.add(menu_edicion);
            barraMenu.add(menu_fuente);
            barraMenu.add(menu_tamaño);
            barraMenu.add(menu_estilo);
            barraMenu.add(menu_parrafo);
            barraMenu.add(menu_color);
            barraMenu.add(menu_skin);
            barraMenu.add(menu_idioma);
            barraMenu.add(menu_informacion);
            
            menu_contextual.add(contextual_copiar);
            menu_contextual.add(contextual_cortar);
            menu_contextual.add(contextual_pegar);
            menu_contextual.add(new JSeparator());
            menu_contextual.add(contextual_negrita);
            menu_contextual.add(contextual_cursiva);
            menu_contextual.add(contextual_subrayado);
            menu_contextual.add(new JSeparator());
            menu_contextual.add(contextual_justificado);
            menu_contextual.add(contextual_izquierda);
            menu_contextual.add(contextual_centrado);
            menu_contextual.add(contextual_derecha);
            
            //para definir las teclas de los atajos rápidos
            submenu_abrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
            submenu_guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
            submenu_salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
            
            submenu_deshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
            submenu_rehacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
            submenu_copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
            submenu_cortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
            submenu_pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
            
            submenu_negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
            submenu_cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
            submenu_subrayado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
           
            submenu_centrado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
            submenu_justificado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
            submenu_derecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
            submenu_izquierda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
            
            //cogemos el idioma preterminado del sistema
            Locale.getDefault();
            
            //Seleccionamos en el menu el idioma que tenga establecido del sistema
            if(Locale.getDefault().equals(new Locale("es","ES"))){
                submenu_español.setSelected(true);
                
            }else if(Locale.getDefault().equals(Locale.ENGLISH)){
                submenu_ingles.setSelected(true);
                
            }else if(Locale.getDefault().equals(Locale.FRENCH)){
                submenu_frances.setSelected(true);
            }
            
            //establecemos un margen al panel de texto
            tp.setMargin(new Insets(50,50,50,50));
            
            //para añadir los tipos de fuente
            String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            
            for(String fuente:fuentes){
                tipoLetras.addItem(fuente);
            }
            
            //caracteristicas tamaño letra
            for(int i=10;i<=64;i+=2){
            tamanyo.addItem(i);
            }
            
            //para establecer el tipo de fuente en todos los lugares
            tipoLetras.setSelectedItem("Helvetica");
            tamanyo.setSelectedItem(14);
            submenu_14.setSelected(true);
            
            tp.setFont(new Font((String)tipoLetras.getItemAt(tipoLetras.getSelectedIndex()), Font.PLAIN,
                    (int) tamanyo.getItemAt(tamanyo.getSelectedIndex())));
            tp.setComponentPopupMenu(menu_contextual);
            
            //para que este seleccionada por defecto la skin preterminada
            submenu_skin_default.setSelected(true);
            
            //para que los botones no se queden seleccionados
            deshacer.setFocusable(false);
            rehacer.setFocusable(false);
            copiar.setFocusable(false);
            cortar.setFocusable(false);
            pegar.setFocusable(false);
            abrir.setFocusable(false);
            guardar.setFocusable(false);
            salir.setFocusable(false);
            imagen.setFocusable(false);
            tipoLetras.setFocusable(false);
            tamanyo.setFocusable(false);
            negrita.setFocusable(false); 
            cursiva.setFocusable(false);
            subrayado.setFocusable(false);
            text_aling_center.setFocusable(false); 
            text_aling_full.setFocusable(false);
            text_aling_right.setFocusable(false);
            text_aling_left.setFocusable(false);
            colores_fuente.setFocusable(false);
            
            //listeners menu
            submenu_copiar.addActionListener(ce);
            submenu_cortar.addActionListener(ce);
            submenu_pegar.addActionListener(ce);
            submenu_arial.addActionListener(ce);
            submenu_verdana.addActionListener(ce);
            submenu_courier.addActionListener(ce);
            submenu_impact.addActionListener(ce);
            submenu_negrita.addActionListener(ce);
            submenu_cursiva.addActionListener(ce);
            submenu_subrayado.addActionListener(ce);
            submenu_10.addActionListener(ce);
            submenu_14.addActionListener(ce);
            submenu_18.addActionListener(ce);
            submenu_22.addActionListener(ce);
            submenu_centrado.addActionListener(ce);
            submenu_justificado.addActionListener(ce);
            submenu_derecha.addActionListener(ce);
            submenu_izquierda.addActionListener(ce);
            submenu_español.addActionListener(ce);
            submenu_ingles.addActionListener(ce);
            submenu_frances.addActionListener(ce);
            submenu_informacion.addActionListener(ce);
            submenu_color.addActionListener(ce);
            submenu_abrir.addActionListener(ce);
            submenu_guardar.addActionListener(ce);
            submenu_salir.addActionListener(ce);
            submenu_skin_default.addActionListener(ce);
            submenu_skin_dark.addActionListener(ce);
            submenu_skin_simple.addActionListener(ce);
            submenu_skin_mint.addActionListener(ce);
            
            
            //listeners contextual
            contextual_copiar.addActionListener(ce);
            contextual_cortar.addActionListener(ce);
            contextual_pegar.addActionListener(ce);
            contextual_negrita.addActionListener(ce);
            contextual_cursiva.addActionListener(ce);
            contextual_subrayado.addActionListener(ce);
            contextual_centrado.addActionListener(ce);
            contextual_justificado.addActionListener(ce);
            contextual_derecha.addActionListener(ce);
            contextual_izquierda.addActionListener(ce);
            
            
            //listeners barra herramientas
            abrir.addActionListener(ce);
            guardar.addActionListener(ce);
            salir.addActionListener(ce);
            imagen.addActionListener(ce);
            tipoLetras.addActionListener(ce);
            tamanyo.addActionListener(ce);
            negrita.addActionListener(ce);
            cursiva.addActionListener(ce);
            subrayado.addActionListener(ce);
            text_aling_center.addActionListener(ce);
            text_aling_full.addActionListener(ce);
            text_aling_left.addActionListener(ce);
            text_aling_right.addActionListener(ce);
            colores_fuente.addActionListener(ce);
            deshacer.addActionListener(ce);
            rehacer.addActionListener(ce);
            copiar.addActionListener(ce);
            cortar.addActionListener(ce);
            pegar.addActionListener(ce);
            tp.getDocument().addUndoableEditListener(undoManager); 
            
            
            //bara superior del editor
            barra.setMargin(new Insets(10, 0, 10, 0));
            barra.add(abrir);
            barra.add(guardar);
            barra.add(salir);
            barra.addSeparator();
            tipoLetras.setMaximumSize(tipoLetras.getPreferredSize());
            barra.add(tipoLetras);
            tamanyo.setMaximumSize(tamanyo.getPreferredSize());
            barra.add(tamanyo);
            barra.addSeparator();
            barra.add(negrita);
            barra.add(cursiva);
            barra.add(subrayado);
            barra.addSeparator();
            barra.add(text_aling_full);
            barra.add(text_aling_left);
            barra.add(text_aling_center);
            barra.add(text_aling_right);
            barra.addSeparator();
            barra.add(colores_fuente);
            barra2.add(imagen);
            barra3.add(deshacer);
            barra3.add(rehacer);
            barra3.addSeparator();
            barra3.add(pegar);
            barra3.add(copiar);
            barra3.add(cortar);
            
            pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_inicio")), barra);
            pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_insertar")), barra2);
            pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_edicion")), barra3);
            
            barra.setBackground(Color.WHITE);
            barra2.setBackground(Color.WHITE);
            barra3.setBackground(Color.WHITE);

            add(pestañas, BorderLayout.NORTH);
            //...
         
            //añadimos el panel centrado con bordes por ambos lados al estilo word
            Box cajaV=Box.createVerticalBox();
            Box cajaH1=Box.createHorizontalBox();
           
            cajaH1.add(Box.createHorizontalStrut(150));
            cajaH1.add(sp);
            cajaH1.add(Box.createHorizontalStrut(150));
            
            cajaV.add(Box.createVerticalStrut(20));
            cajaV.add(cajaH1);
   
            add(cajaV, BorderLayout.CENTER);
       
        }
        
        
    //Método para cambiar de idioma todas las etiquetas
    public void cambiarIdioma(){
    
    menu_archivo.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_archivo")); 
    menu_edicion.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_edicion"));
    menu_fuente.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_fuente"));
    menu_tamaño.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_tamaño"));
    menu_estilo.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_estilo"));
    menu_parrafo.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_parrafo"));
    menu_color.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_color"));
    menu_skin.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_skin"));
    menu_idioma.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_idioma"));
    menu_informacion.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_menu_informacion"));
               
    submenu_abrir.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_abrir"));
    submenu_guardar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_guardar"));
    submenu_salir.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_salir"));
    submenu_deshacer.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_deshacer"));
    submenu_rehacer.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_rehacer"));
    submenu_copiar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_copiar"));
    submenu_cortar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cortar"));
    submenu_pegar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pegar"));
          
    submenu_negrita.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_negrita"));
    submenu_cursiva.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cursiva"));
    submenu_subrayado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_subrayado"));
    submenu_centrado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_centrado"));
    submenu_justificado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_justificado"));
    submenu_izquierda.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_izquierda"));
    submenu_derecha.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_derecha"));
    submenu_español.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_español"));
    submenu_ingles.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_ingles"));
    submenu_frances.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_idioma_frances"));
    submenu_color.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_color"));
    submenu_informacion.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_inf_acercade"));
   
    submenu_skin_default.setText((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_default")));
    submenu_skin_dark.setText((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_dark")));
    submenu_skin_simple.setText((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_simple")));
    submenu_skin_mint.setText((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_skin_mint")));
            
    contextual_cortar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cortar"));
    contextual_copiar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_copiar"));
    contextual_pegar.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pegar")); 
    contextual_negrita.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_negrita"));
    contextual_cursiva.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_cursiva"));
    contextual_subrayado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_subrayado"));
    contextual_centrado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_centrado"));
    contextual_justificado.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_justificado"));
    contextual_izquierda.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_izquierda"));
    contextual_derecha.setText(ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_just_derecha"));
    
    pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_inicio")), barra);
    pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_insertar")), barra2);
    pestañas.addTab((ResourceBundle.getBundle("etIdiomas.Etiquetas").getString("etiqueta_pestaña_edicion")), barra3);
            
    
}
        
    }
   
