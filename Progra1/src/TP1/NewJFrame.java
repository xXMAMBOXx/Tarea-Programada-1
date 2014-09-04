package TP1;
import java.io.File;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javafx.stage.FileChooser;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author xXMAMBOXx
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
         TLetra.setEditable(false);
         //NewJFrame.setResizable( false );
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoBusqueda = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        VentanaP = new javax.swing.JPanel();
        Genero = new javax.swing.JRadioButton();
        Albúm = new javax.swing.JRadioButton();
        xbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadeCanciones = new javax.swing.JList();
        Agregar = new javax.swing.JButton();
        Artista = new javax.swing.JRadioButton();
        Mimagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ncanciones = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        Nresultados = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        jArtista = new javax.swing.JLabel();
        jAlbum = new javax.swing.JLabel();
        jGenero = new javax.swing.JLabel();
        jDuracion = new javax.swing.JLabel();
        Progreso = new javax.swing.JProgressBar();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Mtitulo = new javax.swing.JLabel();
        Martista = new javax.swing.JLabel();
        Malbum = new javax.swing.JLabel();
        Mgenero = new javax.swing.JLabel();
        Bnombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TLetra = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(958, 542));
        setResizable(false);

        VentanaP.setBackground(new java.awt.Color(0, 102, 102));
        VentanaP.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        VentanaP.setForeground(new java.awt.Color(255, 255, 255));
        VentanaP.setMaximumSize(new java.awt.Dimension(958, 542));
        VentanaP.setMinimumSize(new java.awt.Dimension(958, 542));
        VentanaP.setName("i-MP3"); // NOI18N

        Genero.setBackground(new java.awt.Color(0, 102, 102));
        TipoBusqueda.add(Genero);
        Genero.setForeground(new java.awt.Color(255, 255, 255));
        Genero.setText("Genero");
        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });

        Albúm.setBackground(new java.awt.Color(0, 102, 102));
        TipoBusqueda.add(Albúm);
        Albúm.setForeground(new java.awt.Color(255, 255, 255));
        Albúm.setText("Albúm");
        Albúm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlbúmActionPerformed(evt);
            }
        });

        xbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        xbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbuscarActionPerformed(evt);
            }
        });

        ListadeCanciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListadeCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListadeCancionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListadeCanciones);

        Agregar.setText("Agregar");
        Agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102)));
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Artista.setBackground(new java.awt.Color(0, 102, 102));
        TipoBusqueda.add(Artista);
        Artista.setForeground(new java.awt.Color(255, 255, 255));
        Artista.setText("Artista");
        Artista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtistaActionPerformed(evt);
            }
        });

        Mimagen.setText(" ");
        Mimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Mimagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MimagenMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Búsqueda :");

        Titulo.setBackground(new java.awt.Color(0, 102, 102));
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("i-MP3");

        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("Total de canciones:");

        Ncanciones.setForeground(new java.awt.Color(255, 255, 255));
        Ncanciones.setText("0");

        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setText("Resultado(s):");

        Nresultados.setForeground(new java.awt.Color(255, 255, 255));

        jTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(240, 240, 240));
        jTitulo.setText(" ");

        jArtista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jArtista.setForeground(new java.awt.Color(240, 240, 240));
        jArtista.setText(" ");

        jAlbum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAlbum.setForeground(new java.awt.Color(240, 240, 240));
        jAlbum.setText(" ");

        jGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jGenero.setForeground(new java.awt.Color(240, 240, 240));
        jGenero.setText(" ");

        jDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDuracion.setForeground(new java.awt.Color(240, 240, 240));
        jDuracion.setText(" ");

        Progreso.setBackground(new java.awt.Color(153, 153, 153));
        Progreso.setForeground(new java.awt.Color(0, 102, 102));
        Progreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setText("Modfificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Mtitulo.setForeground(new java.awt.Color(255, 51, 51));
        Mtitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MtituloMouseClicked(evt);
            }
        });

        Martista.setForeground(new java.awt.Color(255, 51, 51));
        Martista.setText(" ");
        Martista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MartistaMouseClicked(evt);
            }
        });

        Malbum.setForeground(new java.awt.Color(255, 0, 0));
        Malbum.setText(" ");
        Malbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MalbumMouseClicked(evt);
            }
        });

        Mgenero.setForeground(new java.awt.Color(255, 0, 0));
        Mgenero.setText(" ");
        Mgenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MgeneroMouseClicked(evt);
            }
        });

        Bnombre.setForeground(new java.awt.Color(255, 255, 255));
        Bnombre.setText("Nombre:");

        TLetra.setColumns(20);
        TLetra.setRows(5);
        TLetra.setText("Letra!");
        jScrollPane2.setViewportView(TLetra);

        javax.swing.GroupLayout VentanaPLayout = new javax.swing.GroupLayout(VentanaP);
        VentanaP.setLayout(VentanaPLayout);
        VentanaPLayout.setHorizontalGroup(
            VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPLayout.createSequentialGroup()
                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Mgenero)
                                    .addComponent(Martista)
                                    .addComponent(Malbum))
                                .addGap(18, 18, 18)
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPLayout.createSequentialGroup()
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Mimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                    .addComponent(Progreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaPLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)))))
                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addComponent(Genero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Artista))
                            .addComponent(Bnombre))
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Albúm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 95, Short.MAX_VALUE))))
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VentanaPLayout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(Nresultados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Result))
                                .addGap(0, 48, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addComponent(Total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ncanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        VentanaPLayout.setVerticalGroup(
            VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Total)
                                    .addComponent(Ncanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nresultados))
                            .addGroup(VentanaPLayout.createSequentialGroup()
                                .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(VentanaPLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(Progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(VentanaPLayout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Eliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(Modificar)
                                        .addGap(34, 34, 34)
                                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jArtista)
                                            .addComponent(Martista))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jAlbum)
                                            .addComponent(Malbum))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jGenero)
                                            .addComponent(Mgenero))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDuracion)))
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(VentanaPLayout.createSequentialGroup()
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Genero)
                            .addComponent(Artista)
                            .addComponent(Albúm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mtitulo)
                            .addComponent(Bnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(560, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
          Bnombre.setText("");Eliminaredit();if (xbuscar.getText().equals("")||Lcanciones.getsize()==0){
            if (Lcanciones.getsize()!=0){
                 llenartodos(Lcanciones);    
            }
            System.out.println("si");
            return;  
        }
        int i=0;
        String nombre=null;
        System.out.println(Lcanciones.obtenerCancion().getgenero());
        DefaultListModel listac=new DefaultListModel();
        arraycanciones=Lcanciones.ListatoArray().busquedaGenero(xbuscar.getText());
        String total=Integer.toString(arraycanciones.getSize());
        Nresultados.setText(total);
        while(i!=arraycanciones.getSize()){
            try {
                nombre=arraycanciones.getElemento(i++).getTitulo();
            } catch (Exception ex) {
                
            }
            listac.addElement(nombre);
        }
        
        ListadeCanciones.setModel(listac);
    }//GEN-LAST:event_GeneroActionPerformed

    private void AlbúmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlbúmActionPerformed
          Bnombre.setText("");Eliminaredit();if (xbuscar.getText().equals("")||Lcanciones.getsize()==0){
            if (Lcanciones.getsize()!=0){
                 llenartodos(Lcanciones);    
            }
            System.out.println("si");
            return;  
        }
        
        int i=0;
        String nombre=null;
        DefaultListModel listac=new DefaultListModel();
        arraycanciones=Lcanciones.ListatoArray().busquedaAlbum(xbuscar.getText());
        String total=Integer.toString(arraycanciones.getSize());
        Nresultados.setText(total);
        while(i!=arraycanciones.getSize()){
            try {
                nombre=arraycanciones.getElemento(i++).getTitulo();
            } catch (Exception ex) {
                
            }
            listac.addElement(nombre);
        }
        
        ListadeCanciones.setModel(listac);
        
        
    }//GEN-LAST:event_AlbúmActionPerformed

    private void ListadeCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadeCancionesMouseClicked
        Eliminaredit();if(actual==null&Lcanciones.getsize()==0){
            return;
        }
        actual.STOP();
        try {
             terminar=true;
              sonar=false;
              sleep(1000);
            actual=arraycanciones.getElemento(ListadeCanciones.getAnchorSelectionIndex());
         // System.out.println(ListadeCanciones.getAnchorSelectionIndex());
            llenardatos();
            terminar=false;
            sonar=true;
            Barra();
            actual.PLAY();   
        } catch (Exception ex) {}
        
            
        try{if(actual.rutaI.equals("Desconocido")){Mimagen.setIcon(new ImageIcon(actual.rutaI));}
            }catch(Exception e){}
            
        
     
    }//GEN-LAST:event_ListadeCancionesMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        JFileChooser buscar=new JFileChooser();Eliminaredit();
        FileNameExtensionFilter filtromp3= new FileNameExtensionFilter("MP3", "mp3");
        buscar.setFileFilter(filtromp3);
        String ruta;
        int seleccionado=buscar.showOpenDialog(null);
        try{
            File archivo= buscar.getSelectedFile();
            ruta= archivo.getAbsolutePath();
        }catch(Exception e){
            return;
        }
        Cancion song=new Cancion(ruta);
        Lcanciones.agregar(song);
        establecerTotal();
        if (!sonando){
            sonando=true;
            actual=song;
            llenardatos();
            llenartodos(Lcanciones);
            sonar=true;
            ListadeCanciones.setSelectedIndex(0);
            Barra();
            actual.PLAY();
            
            return;
           
        }
        //System.out.println(actual.rutaI);
        actual.STOP();
        terminar=true;
        try {
            //sonar=false;
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        actual=song;
        llenardatos();
        llenartodos(Lcanciones);
        terminar=false;
        sonar=true;
       
        Barra();
        actual.PLAY();
        try{if(actual.rutaI.equals("Desconocido")){Mimagen.setIcon(new ImageIcon(actual.rutaI));}
            }catch(Exception e){}
       
        
        
        
     
    }//GEN-LAST:event_AgregarActionPerformed
    public void establecerTotal(){
        String total=Integer.toString(Lcanciones.getsize());
        Ncanciones.setText(total);
    }
    
    private void ArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtistaActionPerformed
        Bnombre.setText("");Eliminaredit();if (xbuscar.getText().equals("")||Lcanciones.getsize()==0){
            if (Lcanciones.getsize()!=0){
                 llenartodos(Lcanciones);    
            }
            System.out.println("si");
            return;  
        }
        int i=0;
        String nombre=null;
        System.out.println(Lcanciones.obtenerCancion().getgenero());
        DefaultListModel listac=new DefaultListModel();
        arraycanciones=Lcanciones.ListatoArray().busquedaArtista(xbuscar.getText());
        String total=Integer.toString(arraycanciones.getSize());
        Nresultados.setText(total);
        while(i!=arraycanciones.getSize()){
            try {
                nombre=arraycanciones.getElemento(i++).getTitulo();
            } catch (Exception ex) {
                
            }
            listac.addElement(nombre);
        }
        
        ListadeCanciones.setModel(listac);
    }//GEN-LAST:event_ArtistaActionPerformed

    private void xbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbuscarActionPerformed
        Bnombre.setText("Nombre :");Eliminaredit();if (xbuscar.getText().equals("")||Lcanciones.getsize()==0){
            if (Lcanciones.getsize()!=0){
                 llenartodos(Lcanciones);    
            }
            System.out.println("si");
            return;  
        }
        TipoBusqueda.clearSelection();
        int i=0;
        String nombre=null;
        System.out.println(Lcanciones.obtenerCancion().getgenero());
        DefaultListModel listac=new DefaultListModel();
        arraycanciones=Lcanciones.ListatoArray().busquedaCancion(xbuscar.getText());
        String total=Integer.toString(arraycanciones.getSize());
        Nresultados.setText(total);
        while(i!=arraycanciones.getSize()){
            try {
                nombre=arraycanciones.getElemento(i++).getTitulo();
            } catch (Exception ex) {
                
            }
            listac.addElement(nombre);
        }
        
        ListadeCanciones.setModel(listac);
    }//GEN-LAST:event_xbuscarActionPerformed

    private void MimagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MimagenMouseClicked
        if(actual==null){
            return;
        }
        JFileChooser buscar=new JFileChooser();
        FileNameExtensionFilter filtrojpg= new FileNameExtensionFilter("jpg", "jpg");
        buscar.setFileFilter(filtrojpg);
        String ruta;
        int seleccionado=buscar.showOpenDialog(null);
        try{
            File archivo= buscar.getSelectedFile();
            ruta= archivo.getAbsolutePath();
            actual.setImage(ruta);
            Mimagen.setIcon(new ImageIcon(actual.getImagen()));
            
        }catch(Exception e){
            return;
        }
        
    }//GEN-LAST:event_MimagenMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        ListaCanciones temp=new ListaCanciones();
        if (actual==null){try{
            JOptionPane.showMessageDialog(rootPane,"Por favor seleccione la cancion que desea borrar");
            return;
        }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane,"Por favor seleccione la cancion que desea borrar");
        }
        JOptionPane.showMessageDialog(rootPane,"Por favor seleccione la cancion que desea borrar");
            return;}
        actual.STOP();
        temp=Lcanciones.eliminar(actual);Lcanciones=null;Lcanciones=temp;
        llenardatos();
        llenartodos(Lcanciones);
        Vaciar();
        terminar=true;
        establecerTotal();Eliminaredit();
        JOptionPane.showMessageDialog(rootPane,"Se ha eliminado correctamente" );
        TLetra.setText("Letra!");
        return;
    }//GEN-LAST:event_EliminarActionPerformed

    private void MtituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MtituloMouseClicked
        if(actual==null&Mtitulo.getText()==""){return;}
        String cambio;
        cambio=JOptionPane.showInputDialog("Digite el nuevo título");
        if (cambio==null){return;}
        actual.setNombre(cambio);
        llenardatos();
        llenartodos(Lcanciones);
        Mtitulo.setText("");
        
    }//GEN-LAST:event_MtituloMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if(actual==null){
                JOptionPane.showMessageDialog(rootPane,"Por favor seleccione la cancion que desea modificar");
                return;}
        JOptionPane.showMessageDialog(null,"Presione editar para modificar lo que desee");
        Mtitulo.setText("Editar");Martista.setText("Editar");Malbum.setText("Editar");Mgenero.setText("Editar");

         
        
    }//GEN-LAST:event_ModificarActionPerformed
    public void Eliminaredit(){
        Mtitulo.setText("");Martista.setText("");Malbum.setText("");Mgenero.setText("");

    }
    private void MartistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MartistaMouseClicked
        if(actual==null&Mtitulo.getText()==""){return;}
        String cambio;
        cambio=JOptionPane.showInputDialog("Digite el nuevo nombre de artista");
        if (cambio==null){return;}
        actual.setArtista(cambio);
        llenardatos();
        llenartodos(Lcanciones);
        Martista.setText("");
    }//GEN-LAST:event_MartistaMouseClicked

    private void MalbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MalbumMouseClicked
        if(actual==null&Mtitulo.getText()==""){return;}
        String cambio;
        cambio=JOptionPane.showInputDialog("Digite el nuevo nombre del album");
        if (cambio==null){return;}
        actual.setAlbum(cambio);
        llenardatos();
        llenartodos(Lcanciones);
        Malbum.setText("");
    }//GEN-LAST:event_MalbumMouseClicked

    private void MgeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MgeneroMouseClicked
        if(actual==null&Mtitulo.getText()==""){return;}
        String cambio;
        cambio=JOptionPane.showInputDialog("Digite el nuevo género");
        if (cambio==null){return;}
        actual.setGenero(cambio);
        llenardatos();
        llenartodos(Lcanciones);
        Mgenero.setText("");
    }//GEN-LAST:event_MgeneroMouseClicked

    public void llenartodos(ListaCanciones list){
        Nresultados.setText("");
        int i=0;
        String nombre=null;
        DefaultListModel listac=new DefaultListModel();
        arraycanciones=list.ListatoArray();
        //System.out.println(list.obtenerCancion().getTitulo());
        while(i!=arraycanciones.getSize()){
            try {
                nombre=arraycanciones.getElemento(i++).getTitulo();
            } catch (Exception ex) {
                
            }
            listac.addElement(nombre);
        }
        
        ListadeCanciones.setModel(listac);
        
    } 
     
    public void llenardatos(){
        jTitulo.setText("Titulo: "+actual.getTitulo());
        jAlbum.setText("Album: "+actual.getAlbum());
        jGenero.setText("Genero: "+actual.getgenero());
        jArtista.setText("Artista: "+actual.getArtista());
        jDuracion.setText("Duracion: "+(((double) actual.getduracion())/60));
        if(actual.getImagen()!=null){
            Mimagen.setIcon(new ImageIcon(actual.getImagen()));
        }
        else{
        Mimagen.setIcon(null);
        }
        try {
              
              TLetra.setText(ObtenerLetra.getLetra(actual.getArtista(),actual.getTitulo()));  
               
            } catch (Exception e) {
                TLetra.setText("No se ha encontrado la letra de la cancion!");}
    }
    
    public void Vaciar(){
        jTitulo.setText("");
        jAlbum.setText("");
        jGenero.setText("");
        jArtista.setText("");
        jDuracion.setText("");
        Mimagen.setIcon(null);
    }
    public void Barra(){
        
          new Thread(
            new Runnable(){
                @SuppressWarnings({"empty-statement", "SleepWhileInLoop"})
                @Override
                public void run(){
                    try{
                        
                        double i=0;
                        int b=0;
                        int segundos=actual.getduracion();
                     //Progreso.setValue(0);
                        while(true){
                            
                            while(sonar){
                                 if (terminar){
                                 Progreso.setValue(0);
                                 i=0;
                                 b=0;
                                  segundos=actual.getduracion();
                                 sonar=false;
                                 return;}
                               
                                

                                i= ((b*100)/segundos);//los 252 son segundos cuando logre
                                b+=1;//sacar la duracion del track en minotos se miltiplica por 60
                                 Progreso.setValue((int)i);
                                Thread.sleep(1000);
                               
                                 if (i==100){
                                          i=0;
                                     b=0;
                                      Progreso.setValue(0);
                                      sonar=false;
                                      segundos=actual.getduracion();
                                ListadeCanciones.setSelectedIndex(ListadeCanciones.getSelectedIndex()+1);
                                
                                actual=arraycanciones.getElemento(ListadeCanciones.getSelectedIndex());
                                llenardatos();
                                sonar=true;
                                Barra();
                                actual.PLAY();
                          return;
                           }
                                
                            }
                                return;
                         
                       
                          //eso.setValue(0);
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Ocurrio un error");
                    }
                    
                }
            }
        ).start();
        
    }
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                
                new NewJFrame().setVisible(true);
                
                
                
            }
        });
        
    }
    
    ListaCanciones Lcanciones=new ListaCanciones();
    ArrayList arraycanciones=new ArrayList(Lcanciones.getsize());
    Cancion actual;
 
    boolean sonando=false,modificar=false;
    boolean sonar=false,terminar=false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JRadioButton Albúm;
    private javax.swing.JRadioButton Artista;
    private javax.swing.JLabel Bnombre;
    private javax.swing.JButton Eliminar;
    private javax.swing.JRadioButton Genero;
    private javax.swing.JList ListadeCanciones;
    private javax.swing.JLabel Malbum;
    private javax.swing.JLabel Martista;
    private javax.swing.JLabel Mgenero;
    private javax.swing.JLabel Mimagen;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Mtitulo;
    private javax.swing.JLabel Ncanciones;
    private javax.swing.JLabel Nresultados;
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel Result;
    private javax.swing.JTextArea TLetra;
    public static javax.swing.ButtonGroup TipoBusqueda;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Total;
    private javax.swing.JPanel VentanaP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jAlbum;
    private javax.swing.JLabel jArtista;
    private javax.swing.JLabel jDuracion;
    private javax.swing.JLabel jGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTextField xbuscar;
    // End of variables declaration//GEN-END:variables

}
