/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import interfaz.IntTP1.LD.Reproductor;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JCheckBox;//Librería para la selección de la imagen
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;//t
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;
import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;
import org.tritonus.share.sampled.file.TAudioFileFormat;


public class IntTP1 extends javax.swing.JFrame {//Clase principal
    
    LD reproducir;//Creamos el objeto que va a reproducir
    
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de cancion","MP3");//ceamos un objeto de tipo FileNameExtensionFilter
    String rutacancion;//creamos la variable rutacancion
    
    
    public IntTP1() throws BasicPlayerException {//constructor crea un nueov objeto LD 
        this.reproducir = new LD();
        
        
        initComponents();
        rutacancion="";
        //mkm
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jFrame5 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        BotonAnterior = new javax.swing.JButton();
        BotonReproducir = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonDetener = new javax.swing.JButton();
        BotonPausar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        TxtArtista = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        TxtAlbum = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        TxtCancion = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        TxtGenero = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        TxtDuracion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        BuscarCancion = new javax.swing.JCheckBox();
        BuscarArtista = new javax.swing.JCheckBox();
        BuscarAlbum = new javax.swing.JCheckBox();
        BuscarGenero = new javax.swing.JCheckBox();
        BotonActualizar = new javax.swing.JButton();
        BusquedaAvanzada = new javax.swing.JTextField();
        jButtonBuquedaAvan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTextArea1.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setText("Canción");

        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList3);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Little Devil\n");

        jPanel1.setBackground(new java.awt.Color(145, 4, 4));
        jPanel1.setForeground(new java.awt.Color(5, 12, 12));

        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/anterior.png"))); // NOI18N
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });

        BotonReproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/diablo.gif"))); // NOI18N
        BotonReproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReproducirActionPerformed(evt);
            }
        });

        BotonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/sig2.jpg"))); // NOI18N
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        BotonDetener.setBackground(new java.awt.Color(145, 4, 4));
        BotonDetener.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BotonDetener.setText("Volver inicio");
        BotonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetenerActionPerformed(evt);
            }
        });

        BotonPausar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/detener.jpg"))); // NOI18N
        BotonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPausarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Canción");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Artista");

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Álbum");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Género");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Duración");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(jLabel2)
                .addGap(197, 197, 197)
                .addComponent(jLabel3)
                .addGap(208, 208, 208)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BotonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/agregar.jpg"))); // NOI18N
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/borrar.jpg"))); // NOI18N
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonModificar.setBackground(new java.awt.Color(145, 4, 4));
        BotonModificar.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        TxtArtista.setEditable(false);
        TxtArtista.setColumns(20);
        TxtArtista.setLineWrap(true);
        TxtArtista.setRows(5);
        jScrollPane8.setViewportView(TxtArtista);

        TxtAlbum.setEditable(false);
        TxtAlbum.setColumns(20);
        TxtAlbum.setLineWrap(true);
        TxtAlbum.setRows(5);
        jScrollPane9.setViewportView(TxtAlbum);

        TxtCancion.setEditable(false);
        TxtCancion.setColumns(20);
        TxtCancion.setLineWrap(true);
        TxtCancion.setRows(5);
        jScrollPane10.setViewportView(TxtCancion);

        TxtGenero.setEditable(false);
        TxtGenero.setColumns(20);
        TxtGenero.setLineWrap(true);
        TxtGenero.setRows(5);
        jScrollPane11.setViewportView(TxtGenero);

        TxtDuracion.setEditable(false);
        TxtDuracion.setColumns(20);
        TxtDuracion.setLineWrap(true);
        TxtDuracion.setRows(5);
        jScrollPane12.setViewportView(TxtDuracion);

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Buscar");

        BuscarCancion.setBackground(new java.awt.Color(145, 4, 4));
        BuscarCancion.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BuscarCancion.setForeground(new java.awt.Color(254, 254, 254));
        BuscarCancion.setText("Canción");
        BuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCancionActionPerformed(evt);
            }
        });

        BuscarArtista.setBackground(new java.awt.Color(145, 4, 4));
        BuscarArtista.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BuscarArtista.setForeground(new java.awt.Color(253, 251, 251));
        BuscarArtista.setText("Artista");
        BuscarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarArtistaActionPerformed(evt);
            }
        });

        BuscarAlbum.setBackground(new java.awt.Color(145, 4, 4));
        BuscarAlbum.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BuscarAlbum.setForeground(new java.awt.Color(254, 254, 254));
        BuscarAlbum.setText("Álbum");

        BuscarGenero.setBackground(new java.awt.Color(145, 4, 4));
        BuscarGenero.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BuscarGenero.setForeground(new java.awt.Color(254, 254, 254));
        BuscarGenero.setText("Género");

        BotonActualizar.setBackground(new java.awt.Color(145, 4, 4));
        BotonActualizar.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BusquedaAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaAvanzadaActionPerformed(evt);
            }
        });

        jButtonBuquedaAvan.setBackground(new java.awt.Color(145, 4, 4));
        jButtonBuquedaAvan.setFont(new java.awt.Font("Maiandra GD", 0, 15)); // NOI18N
        jButtonBuquedaAvan.setText("Buscar");
        jButtonBuquedaAvan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuquedaAvanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 11, 11));
        jLabel7.setText("LITTLE DEVIL BY DANY lml");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonModificar)
                                .addGap(8, 8, 8)
                                .addComponent(BotonDetener)
                                .addGap(8, 8, 8)
                                .addComponent(BotonActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(BotonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonReproducir)
                                .addGap(18, 18, 18)
                                .addComponent(BotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BuscarCancion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BuscarArtista)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BuscarAlbum))
                                    .addComponent(BusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonBuquedaAvan))
                                    .addComponent(BuscarGenero)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BuscarCancion)
                            .addComponent(BuscarArtista)
                            .addComponent(BuscarAlbum)
                            .addComponent(BuscarGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BusquedaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuquedaAvan)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonReproducir)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonModificar)
                                .addComponent(BotonDetener)
                                .addComponent(BotonActualizar))
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSiguiente)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane10)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane11)
                    .addComponent(jScrollPane12))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Primero creamos un objeto de JFileChooser
     * De dlg llamamos al objeto setFileFilter
     * Se va a abrir la ventana de dialogo para elegir la cancion
     * El metodo reproducir. insertarUltimoe
     * es de la clase Nodo, agrega la canción al último lugra, 
     * el parametro archivo se refiere a la canción
     * @param evt 
     */
    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        
        JFileChooser dlg = new JFileChooser();
        dlg.setFileFilter(filter);
        
        int opcion= dlg.showOpenDialog(this);
         
        if(opcion==JFileChooser.APPROVE_OPTION){
            String file = dlg.getSelectedFile().getPath();
            String archivo = dlg.getSelectedFile().toString();
            
            try {
                reproducir.insertarUltimo(archivo);
            } catch (IOException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TagException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        try {
            reproducir.reproducirAnterior();//Al objeto que se habia creado para reproducir le aplicamos el metodo de reproducriAnterior el cual busca el elem que estaba antes
        } catch (BasicPlayerException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        
        
        
        
        
        
        
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCancionActionPerformed
    }//GEN-LAST:event_BuscarCancionActionPerformed

    private void BuscarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarArtistaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void BotonReproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReproducirActionPerformed
        /**
         * El BotonReproducir es el que permite reproducir
         */
        
        try {
            reproducir.reproducir();/**reproducir.reproducir permite darle click al botón de reproducir y que nos reproduzca
             *
             */
        } catch (BasicPlayerException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_BotonReproducirActionPerformed

    private void BotonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetenerActionPerformed
        reproducir.detener();
    /**
     * En botonDetener llamamos a un metodo el cual detiene la cancion
     */
    }//GEN-LAST:event_BotonDetenerActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int entero= Integer.parseInt(jTextField2.getText());
        try {
            reproducir.borrar(entero);
        } catch (IOException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TagException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPausarActionPerformed
        try {
            reproducir.pausa();//esta es una llamada a un metodo el cual pausa
        } catch (BasicPlayerException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonPausarActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        
        try {
            reproducir.reproducirSiguente();//llama a un metodo que va a reproducir la siguiente cancion
        } catch (BasicPlayerException ex) {
            Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BusquedaAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaAvanzadaActionPerformed
        
    }//GEN-LAST:event_BusquedaAvanzadaActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        String nombre = "";
        String artista="";
        String genero="";
        String album="";
        String duracion="";
            reproducir.reco = reproducir.raiz;
            for(int i = 0 ; i < reproducir.cantidad(); ++i){
            try {
                nombre = nombre + reproducir.retornar(4, reproducir.reco)+"\n";
                artista = artista + reproducir.retornar(2, reproducir.reco)+"\n";
                album = album + reproducir.retornar(1, reproducir.reco)+"\n";
                genero = genero + reproducir.retornar(3, reproducir.reco)+"\n";
                duracion = duracion + reproducir.retornar(5, reproducir.reco)+"\n";
                reproducir.reco=reproducir.reco.sig;
            } catch (IOException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TagException ex) {
                Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
            }
            TxtCancion.setText(nombre);
            TxtArtista.setText(artista);
            TxtAlbum.setText(album);
            TxtGenero.setText(genero);
            TxtDuracion.setText(duracion);
            }
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void jButtonBuquedaAvanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuquedaAvanActionPerformed
        String nombre = "";
        String artista="";
        String genero="";
        String album="";
        String duracion="";
        String variable = BusquedaAvanzada.getText();
        int cant = reproducir.cantidad();
        int i = 0;
        reproducir.reco = reproducir.raiz;
            if (BuscarArtista.isSelected()){
            while(i < cant){
                try {
                    if (variable == null ? reproducir.retornar(2, reproducir.reco) == null : variable.equals(reproducir.retornar(2, reproducir.reco))){
                            nombre = nombre + reproducir.retornar(4, reproducir.reco)+"\n";
                            artista = artista + reproducir.retornar(2, reproducir.reco)+"\n";
                            album = album + reproducir.retornar(1, reproducir.reco)+"\n";
                            genero = genero + reproducir.retornar(3, reproducir.reco)+"\n";
                            duracion = duracion + reproducir.retornar(5, reproducir.reco)+"\n";
                
                
                    }
                    reproducir.reco=reproducir.reco.sig;
                    i++;
                } catch (IOException | UnsupportedAudioFileException | TagException ex) {
                    Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            TxtCancion.setText(nombre);
                        TxtArtista.setText(artista);
                        TxtAlbum.setText(album);
                        TxtGenero.setText(genero);
                        TxtDuracion.setText(duracion);
            }
            if (BuscarCancion.isSelected()){
            while(i < cant){
                try {
                    if (variable == null ? reproducir.retornar(4, reproducir.reco) == null : variable.equals(reproducir.retornar(4, reproducir.reco))){
                            nombre = nombre + reproducir.retornar(4, reproducir.reco)+"\n";
                            artista = artista + reproducir.retornar(2, reproducir.reco)+"\n";
                            album = album + reproducir.retornar(1, reproducir.reco)+"\n";
                            genero = genero + reproducir.retornar(3, reproducir.reco)+"\n";
                            duracion = duracion + reproducir.retornar(5, reproducir.reco)+"\n";
                
                
                    }
                    reproducir.reco=reproducir.reco.sig;
                    i++;
                } catch (IOException | UnsupportedAudioFileException | TagException ex) {
                    Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            TxtCancion.setText(nombre);
                        TxtArtista.setText(artista);
                        TxtAlbum.setText(album);
                        TxtGenero.setText(genero);
                        TxtDuracion.setText(duracion);
            }
            if (BuscarAlbum.isSelected()){
            while(i < cant){
                try {
                    if (variable == null ? reproducir.retornar(1, reproducir.reco) == null : variable.equals(reproducir.retornar(1, reproducir.reco))){
                            nombre = nombre + reproducir.retornar(4, reproducir.reco)+"\n";
                            artista = artista + reproducir.retornar(2, reproducir.reco)+"\n";
                            album = album + reproducir.retornar(1, reproducir.reco)+"\n";
                            genero = genero + reproducir.retornar(3, reproducir.reco)+"\n";
                            duracion = duracion + reproducir.retornar(5, reproducir.reco)+"\n";
                
                
                    }
                    reproducir.reco=reproducir.reco.sig;
                    i++;
                } catch (IOException | UnsupportedAudioFileException | TagException ex) {
                    Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            TxtCancion.setText(nombre);
                        TxtArtista.setText(artista);
                        TxtAlbum.setText(album);
                        TxtGenero.setText(genero);
                        TxtDuracion.setText(duracion);
            }
            if (BuscarGenero.isSelected()){
            while(i < cant){
                try {
                    if (variable == null ? reproducir.retornar(3, reproducir.reco) == null : variable.equals(reproducir.retornar(3, reproducir.reco))){
                            nombre = nombre + reproducir.retornar(4, reproducir.reco)+"\n";
                            artista = artista + reproducir.retornar(2, reproducir.reco)+"\n";
                            album = album + reproducir.retornar(1, reproducir.reco)+"\n";
                            genero = genero + reproducir.retornar(3, reproducir.reco)+"\n";
                            duracion = duracion + reproducir.retornar(5, reproducir.reco)+"\n";               
                    }
                    reproducir.reco=reproducir.reco.sig;
                    i++;
                } catch (IOException | UnsupportedAudioFileException | TagException ex) {
                    Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            TxtCancion.setText(nombre);
                        TxtArtista.setText(artista);
                        TxtAlbum.setText(album);
                        TxtGenero.setText(genero);
                        TxtDuracion.setText(duracion);
            }
    }//GEN-LAST:event_jButtonBuquedaAvanActionPerformed

    
    public static void main(String args[]) {//es el main
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntTP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntTP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntTP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntTP1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IntTP1().setVisible(true);//esta parte del main hace visible la ventana
                } catch (BasicPlayerException ex) {
                    Logger.getLogger(IntTP1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonDetener;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonPausar;
    private javax.swing.JButton BotonReproducir;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JCheckBox BuscarAlbum;
    private javax.swing.JCheckBox BuscarArtista;
    private javax.swing.JCheckBox BuscarCancion;
    private javax.swing.JCheckBox BuscarGenero;
    private javax.swing.JTextField BusquedaAvanzada;
    private javax.swing.JTextArea TxtAlbum;
    private javax.swing.JTextArea TxtArtista;
    private javax.swing.JTextArea TxtCancion;
    private javax.swing.JTextArea TxtDuracion;
    private javax.swing.JTextArea TxtGenero;
    private javax.swing.JButton jButtonBuquedaAvan;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    
/**
 * Creamos la clase LD
 * Y dentro la clase metadatos
 */   
public class LD
{
    public class Metadatos {
        /**
         * Cada una de estas variables son creadas para almacenar todos los diferente datos
         */

        AbstractID3v2 id3;
        String artist; 
        String song;
        String album;
        String genre;
        int duration;
        int songSize;

        public void Metadatos(String ruta) throws IOException, TagException { //Constructor de la clase Metadatos
       
            MP3File mp3 = new MP3File(ruta); //Crea un nuevo objeto llamando una clase de la libreria
            id3 = mp3.getID3v2Tag(); //Usa el ojeto creado para obener los metadatos de la cancionn dada en la ruta
//            Metadatos d = new Metadatos();//Crea un nuevo objeto de la clase Metadatos
 //           d.Metadatos(id3); //Inicia el constructor de la clase Metadatos con el objeto creado anteriormene            
        }
        /**
         *Metodo para obtener el artista de la cancion
         * @return 
         */
        public String getArtist() { 
            this.artist = id3.getLeadArtist();
            return this.artist; 
        }
        /**
         * Metodo para obtener el nombre de la cancion
         * @return 
         */

        public String getSong() { 
            this.song = id3.getSongTitle();
            return song; 
        }
        /**
         * Metodo para obtener el Album de la cancion
         * @return 
         */

        public String getAlbum() { 
            this.album = id3.getAlbumTitle();
            return album; 
        }
        
        /**
         * Metodo para obtener el genero de la cancion
         * @return 
         */

        public String getGenre() { 
            this.genre = id3.getSongGenre();
            return genre; 
        }
        /**
         * Metodo para obtener la duracion de la cancion
         * @param dato
         * @return
         * @throws UnsupportedAudioFileException
         * @throws IOException 
         */

        
        private String getDuration(String dato) throws UnsupportedAudioFileException, IOException {
            File file = new File(dato);
            AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(file);
            if (fileFormat instanceof TAudioFileFormat) {
                Map<?, ?> properties = ((TAudioFileFormat) fileFormat).properties();
                String key = "duration";
                Long microseconds = (Long) properties.get(key);
                int mili = (int) (microseconds / 1000);
                int sec = (mili / 1000) % 60;
                int min = (mili / 1000) / 60;
                return min + ":" + sec;
            } else {
                throw new UnsupportedAudioFileException();
            }

        }

        public void setArtist(String artista) { //MÃ©todo para modificar el artista de la canciÃ³n
            id3.setLeadArtist(artista);
        }

        public void setSong(String songTitle) { //MÃ©todo para modificar el nombre de la canciÃ³n
            id3.setSongTitle(songTitle);
        }

        public void setAlbum(String songAlbum) { //MÃ©todo para modificar el Ã¡lbum de la canciÃ³n
            id3.setAlbumTitle(songAlbum);
        }

        public void setGenge(String songGenre) { //MÃ©todo para modificar el gÃ©nero de la canciÃ³n
            id3.setSongGenre(songGenre);
        }
    }
    
    public abstract class Reproductor implements BasicPlayerListener 
{
    private final BasicPlayer basicPlayer;
    private double bytesLength;

    /**
     *Constructor
     */
    public Reproductor() throws BasicPlayerException 
    {
        basicPlayer = new BasicPlayer();//crea un objeto tipo BasicPlayer
            basicPlayer.addBasicPlayerListener((BasicPlayerListener) this);//Se agrega 
        basicPlayer.play();//reproduce
    }

    public void play() //crea metodo play
    {
        try {
        basicPlayer.play();//al objeto creado anteriormente le aplica esta opción
        }
        catch (BasicPlayerException e) 
        {
        }
    }

    public void stop() //crea metodo stop
    {
        try 
        {
            basicPlayer.stop();//al objeto creado anteriormente le aplica esta opción
        } 
        catch (BasicPlayerException e) 
        {
        }
    }

    public void pause() throws BasicPlayerException //crea metodo pausa
    {
        basicPlayer.pause();//al objeto creado anteriormente le aplica esta opción
    }

    public void resume() throws BasicPlayerException //crea metodo resume
    {
        basicPlayer.resume();//al objeto creado anteriormente le aplica esta opción
    }

    public void loadFile(String ruta) throws BasicPlayerException //este metodo sirve para abrir la cancion que reproducimos
    {
        basicPlayer.open(new File(ruta));//al objeto creado anteriormente le aplica esta opción
    }



    public void opened(Object arg0, Map arg1) 
    {
        if (arg1.containsKey("audio.length.bytes")) 
        {
            bytesLength = Double.parseDouble(arg1.get("audio.length.bytes").toString());
        }
    }



    public void progress(int bytesread, long microseconds, byte[] pcmdata,Map properties) 
    {
        float progressUpdate = (float) (bytesread * 1.0f / bytesLength * 1.0f);
        int progressNow = (int) (bytesLength * progressUpdate);
        // Descomentando la siguiente lÃ­nea se mosrtarÃ­a el progreso
        // System.out.println(" -> " + progressNow);
    }

    public void setController(BasicController arg0) 
    {
        // TODO Auto-generated method stub

    }


    public void stateUpdated(BasicPlayerEvent arg0) 
    {
        // TODO Auto-generated method stub

    }
    }

    class Nodo //clase nodo
    {
        String info;//inicia la variable info
        Nodo ant,sig;//crea ant y sig qe son varables del Nodo
    }
    
    int conta = 0;//variable para boton de reproduccion
    Metadatos metda;//inicia la variable de tipo metadatos
    Reproductor repro;//inicia la variable de tipo Reproductor
    private Nodo raiz;//inicia la variable Raiz
    private Nodo actual;//Inicia la variable actual
    private Nodo reco;
    
    
    public LD ()throws BasicPlayerException//nuevo constructor
    {
        this.metda = new Metadatos (); //inicia con esta variables
        this.repro = new Reproductor() {};//inicia con esta variable
        raiz=null;//raiz es null
        actual=raiz;//actual sera igual a raiz
    }
    
            
    
    public void insertarUltimo(String cancion) throws IOException, TagException, UnsupportedAudioFileException {//Este metodo agrega al final de la lista de canciones
        Nodo nuevo=new Nodo();//creamos un nuevo Nodo para manejar las canciones
        nuevo.info=cancion;//info es igual a la cancion
        if (raiz==null) {//si raiz es nulo
            nuevo.sig=nuevo;//nuevo.sig lo sustituye por nuevo
            nuevo.ant=nuevo;  //al anterior le asigna le nuevo tambien          
            raiz=nuevo;//raiz pasa a ser nuevo
            actual=raiz;//actual se convierte en raiz
            imprimir(1);//////////////////////////////////////////////////////////////////////////////////
            imprimir(2);//                                                                               //
            imprimir(3);//aqui dependiendo del indice imprime el nombre del artista, cancion, album, etc.//
            imprimir(4);///////////////////////////////////////////////////////////////////////////////////
        } else {//si raiz no es nulo
            Nodo ultimo=raiz.ant;//al ultimo nodo el asigna raiz.ant
            nuevo.sig=raiz;//nuevo.sig le agrego raiz
            nuevo.ant=ultimo;//y al anterior ultimo
            raiz.ant=nuevo;//a raiz.ant le agrgo nuevo
            ultimo.sig=nuevo;//Al ultimo elemnto le agrego nuevo
            imprimir(1);///////////////////////////////777///////////////////////////////////////////////////
            imprimir(2);//                              
            imprimir(3);// aqui dependiendo del indice imprime el nombre del artista, cancion, album, etc                         /
            imprimir(4);/////////////////////////////////
        }
    }    
    
    public boolean vacia ()//revisa si hay una canción ingresada o no hay ninguna
    {
        if (this.raiz == null)//pregunta si la raiz es igual a null
            return true;//devuelve true
        else//si no
            return false;//devuelve false
    }
    
    public void imprimir (int e) throws IOException, TagException, UnsupportedAudioFileException
    {
        if (!vacia()) 
        {
            int i=1;
            Nodo reco=this.raiz;
            do {
                String dato = reco.info;
                this.metda.Metadatos(dato);
                switch(e){
                    case 1:
                metda.getAlbum();
                break;
                    case 2:
                metda.getArtist();
                break;
                    case 3:
                metda.getGenre();
                break;
                    case 4:
                metda.getSong();
                break;
                    case 5:
                metda.getDuration(dato);
                break;
                }
                reco = reco.sig;
                ++i;
            } while (reco!=this.raiz);
            System.out.println();
        }    
    }
public String retornar(int e,Nodo reco) throws IOException, UnsupportedAudioFileException, TagException{
    if (!vacia()) 
        {
                String dato = reco.info;
                this.metda.Metadatos(dato);
                switch(e){
                    case 1:
                return metda.getAlbum();
                    case 2:
                return metda.getArtist();
                    case 3:
                return metda.getGenre();
                    case 4:    
                return metda.getSong();
                    case 5:
                return metda.getDuration(dato);
                }
        }   
        return null;
    }
    public void siguiente()
    {
        if (this.actual==null)
        {
            this.actual= this.raiz;
            this.actual= this.actual.sig;
        } 
        else
        {
            this.actual= this.actual.sig;
        }
    }
    
        public void anterior()
    {
        if (this.actual==null)
        {
            this.actual= this.raiz;
            this.actual= this.actual.ant;
        } 
        else
        {
            this.actual= this.actual.ant;
        }
    }
    
    public int cantidad ()
    {
        int cant = 0;
        if (!vacia()) {
            Nodo reco=this.raiz;
            do {
                cant++;
                reco = reco.sig;                
            } while (reco!=this.raiz);
        }    
        return cant;
    }
    
    public void borrar (int pos) throws IOException, TagException, UnsupportedAudioFileException
    {
        if (pos <= cantidad ())    {
            if (pos == 1) {
                if (cantidad()==1) {
                    raiz=null;
                    this.actual=raiz;
                    imprimir(1);
                    imprimir(2);
                    imprimir(3);
                    imprimir(4);
                } else {
                    Nodo ultimo=raiz.ant;    
                    raiz = raiz.sig;
                    ultimo.sig=raiz;
                    raiz.ant=ultimo;
                    this.actual= raiz;
                    imprimir(1);
                    imprimir(2);
                    imprimir(3);
                    imprimir(4);
                } 
            } else {
                Nodo reco = raiz;
                for (int f = 1 ; f <= pos - 1 ; f++)
                    reco = reco.sig;
                Nodo anterior = reco.ant;
                reco=reco.sig;
                anterior.sig=reco;
                reco.ant=anterior;
            }
        }
    }
    public void reproducir() throws BasicPlayerException
    {
        if(conta==0)
        {
            String dato = this.actual.info;//a esta variable le agrega el string
            repro.loadFile(dato);//llama a este metodo
            repro.play();//lo reproduce
            conta= conta + 1;
        }
        else if(conta==1)
        {
            conta= conta - 1;
            repro.pause();
        }
        
        
    }
    public void reproducirSiguente() throws BasicPlayerException//reproduce el siguiente
    {
        repro.stop();//detiene la cancion
        this.actual=this.actual.sig;//this.actual va a ser this.actual.sig
        String dato = this.actual.info;//al dato le agrega actual
        repro.loadFile(dato);//carga el dato
        repro.play();//reproduce
        
    }
    public void reproducirAnterior() throws BasicPlayerException//Reproduce el anterior
    {
        repro.stop();//Primero tiene que detener la canción que se esta reproduciendo
        this.actual=this.actual.ant;//a this.actual le agrega this.actual.ant que me da la anterior
        String dato = this.actual.info;//el dato va a ser el que tenemos reproduciendo ahora, el actual
        repro.loadFile(dato);//carga el dato
        repro.play();//lo reproduce
        
        
    }
    public void pausa() throws BasicPlayerException //Metodo para pausar
    {
        repro.pause();//llama al metodo pausa
        conta=0;
    }
    public void detener()//metodo para detener
    {
        repro.stop();//la detiene mediante el metodo stop
        actual=raiz;//actual va a tener el valor de raiz
        conta=0;
    }
       
     
        
        
        
            
            
        
    }
   
    }

