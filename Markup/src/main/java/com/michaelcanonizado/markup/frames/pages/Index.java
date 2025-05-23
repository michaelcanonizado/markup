/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.michaelcanonizado.markup.frames.pages;

import com.michaelcanonizado.markup.utils.HtmlFormatter;
import com.michaelcanonizado.markup.utils.Parser;
import com.michaelcanonizado.markup.utils.ParserResult;
import com.michaelcanonizado.markup.utils.StatementData;
import com.michaelcanonizado.markup.utils.StitchBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;



/**
 *
 * @author lilac
 */
public class Index extends javax.swing.JFrame {
    private String text = null;
    private JLabel resultLabel = new JLabel();

    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        simpleTitleBar1.init(this);
        
        guiHeader.setBorder(new StitchBorder(StitchBorder.BOTTOM | StitchBorder.TOP));
        textEditorHeader.setBorder(new StitchBorder(StitchBorder.RIGHT));
        textEditorContainer.setBorder(new StitchBorder(StitchBorder.RIGHT));
        parsingResultHeader.setBorder(new StitchBorder(StitchBorder.TOP | StitchBorder.RIGHT));
        syntaxGuildlineContainer.setBorder(new StitchBorder(StitchBorder.TOP | StitchBorder.RIGHT));
        consoleHeader.setBorder(new StitchBorder(StitchBorder.BOTTOM));
        
        resultLabel.setBounds(10,17,150,20);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        parsingResultHeader.add(resultLabel);
        
        SwingUtilities.invokeLater(textEditor::requestFocusInWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simpleTitleBar2 = new javaswingdev.SimpleTitleBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        simpleTitleBar1 = new javaswingdev.SimpleTitleBar();
        guiHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textEditorContainer = new javax.swing.JPanel();
        textEditorHeader = new javax.swing.JPanel();
        textEditorBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textEditor = new javax.swing.JTextArea();
        parsingResultHeader = new javax.swing.JPanel();
        syntaxGuildlineContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        consoleContainer = new javax.swing.JPanel();
        consoleHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        console = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jTextPane1);

        jPanel4.setBackground(new java.awt.Color(60, 123, 65));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 9, 11));
        setName("index"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(9, 9, 11));

        simpleTitleBar1.setBackground(new java.awt.Color(9, 9, 11));

        guiHeader.setBackground(new java.awt.Color(9, 9, 11));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("@michaelcanonizado");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(250, 250, 250));
        jLabel4.setText("Markup");

        javax.swing.GroupLayout guiHeaderLayout = new javax.swing.GroupLayout(guiHeader);
        guiHeader.setLayout(guiHeaderLayout);
        guiHeaderLayout.setHorizontalGroup(
            guiHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(guiHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guiHeaderLayout.setVerticalGroup(
            guiHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guiHeaderLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        textEditorContainer.setBackground(new java.awt.Color(24, 24, 27));
        textEditorContainer.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        textEditorHeader.setBackground(new java.awt.Color(9, 9, 11));
        textEditorHeader.setPreferredSize(new java.awt.Dimension(512, 50));

        textEditorBtn.setBackground(new java.awt.Color(250, 250, 250));
        textEditorBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textEditorBtn.setForeground(new java.awt.Color(9, 9, 11));
        textEditorBtn.setText("Run");
        textEditorBtn.setBorder(null);
        textEditorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEditorBtnMouseClicked(evt);
            }
        });
        textEditorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEditorBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(24, 24, 27));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 250, 250));
        jLabel2.setText("Text Editor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout textEditorHeaderLayout = new javax.swing.GroupLayout(textEditorHeader);
        textEditorHeader.setLayout(textEditorHeaderLayout);
        textEditorHeaderLayout.setHorizontalGroup(
            textEditorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textEditorHeaderLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textEditorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        textEditorHeaderLayout.setVerticalGroup(
            textEditorHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textEditorHeaderLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textEditorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setBorder(null);

        textEditor.setBackground(new java.awt.Color(24, 24, 27));
        textEditor.setColumns(20);
        textEditor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textEditor.setForeground(new java.awt.Color(250, 250, 250));
        textEditor.setRows(5);
        textEditor.setBorder(null);
        textEditor.setCaretColor(new java.awt.Color(250, 250, 250));
        jScrollPane2.setViewportView(textEditor);

        parsingResultHeader.setBackground(new java.awt.Color(9, 9, 11));
        parsingResultHeader.setForeground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout parsingResultHeaderLayout = new javax.swing.GroupLayout(parsingResultHeader);
        parsingResultHeader.setLayout(parsingResultHeaderLayout);
        parsingResultHeaderLayout.setHorizontalGroup(
            parsingResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        parsingResultHeaderLayout.setVerticalGroup(
            parsingResultHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        syntaxGuildlineContainer.setBackground(new java.awt.Color(9, 9, 11));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 250, 250));
        jLabel5.setText("Escape Sequences : ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 250, 250));
        jLabel6.setText("Syntax : <escape_sequence><string>;");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(250, 250, 250));
        jLabel7.setText("\\h1 : Heading 2");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(250, 250, 250));
        jLabel8.setText("\\h2 : Heading 2");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 250, 250));
        jLabel9.setText("\\h3 : Heading 3");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(250, 250, 250));
        jLabel10.setText("\\p   : Paragraph");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(250, 250, 250));
        jLabel11.setText("\\i                 : Italic");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(250, 250, 250));
        jLabel12.setText("\\b   : Bold");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(250, 250, 250));
        jLabel13.setText("\\u                : Underlined");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 250, 250));
        jLabel14.setText("\\s                 : Strikethrough");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(250, 250, 250));
        jLabel15.setText("\\blockquote : Blockquote");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(250, 250, 250));
        jLabel16.setText("\\li                 : List Item");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(250, 250, 250));
        jLabel19.setText("and synbols apart from ';' and '\\'");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(250, 250, 250));
        jLabel18.setText("String : Can contain any alphanumeric ");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(250, 250, 250));
        jLabel17.setText("Example : \\h1\\bThis is a Heading 1 that is also bold!;");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(250, 250, 250));
        jLabel20.setText("Note: Don't forget the ';' at the end of every line!");

        javax.swing.GroupLayout syntaxGuildlineContainerLayout = new javax.swing.GroupLayout(syntaxGuildlineContainer);
        syntaxGuildlineContainer.setLayout(syntaxGuildlineContainerLayout);
        syntaxGuildlineContainerLayout.setHorizontalGroup(
            syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(41, 41, 41)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                        .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                        .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel19)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        syntaxGuildlineContainerLayout.setVerticalGroup(
            syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(syntaxGuildlineContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(0, 0, 0)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addGap(0, 0, 0)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addGap(0, 0, 0)
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addGroup(syntaxGuildlineContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addGap(5, 5, 5)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(jLabel19)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout textEditorContainerLayout = new javax.swing.GroupLayout(textEditorContainer);
        textEditorContainer.setLayout(textEditorContainerLayout);
        textEditorContainerLayout.setHorizontalGroup(
            textEditorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textEditorHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addComponent(syntaxGuildlineContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parsingResultHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textEditorContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        textEditorContainerLayout.setVerticalGroup(
            textEditorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textEditorContainerLayout.createSequentialGroup()
                .addComponent(textEditorHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(syntaxGuildlineContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(parsingResultHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        consoleContainer.setBackground(new java.awt.Color(9, 9, 11));

        consoleHeader.setBackground(new java.awt.Color(9, 9, 11));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 250, 250));
        jLabel3.setText("Output");

        javax.swing.GroupLayout consoleHeaderLayout = new javax.swing.GroupLayout(consoleHeader);
        consoleHeader.setLayout(consoleHeaderLayout);
        consoleHeaderLayout.setHorizontalGroup(
            consoleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consoleHeaderLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        consoleHeaderLayout.setVerticalGroup(
            consoleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consoleHeaderLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jScrollPane4.setBackground(new java.awt.Color(9, 9, 11));
        jScrollPane4.setBorder(null);

        console.setBackground(new java.awt.Color(9, 9, 11));

        javax.swing.GroupLayout consoleLayout = new javax.swing.GroupLayout(console);
        console.setLayout(consoleLayout);
        consoleLayout.setHorizontalGroup(
            consoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        consoleLayout.setVerticalGroup(
            consoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(console);

        javax.swing.GroupLayout consoleContainerLayout = new javax.swing.GroupLayout(consoleContainer);
        consoleContainer.setLayout(consoleContainerLayout);
        consoleContainerLayout.setHorizontalGroup(
            consoleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consoleHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
        );
        consoleContainerLayout.setVerticalGroup(
            consoleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consoleContainerLayout.createSequentialGroup()
                .addComponent(consoleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(simpleTitleBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(guiHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(textEditorContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consoleContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textEditorContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consoleContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEditorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEditorBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEditorBtnActionPerformed

    private void textEditorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEditorBtnMouseClicked
        this.text = textEditor.getText();
        Parser parser = new Parser(text);
        ParserResult result = parser.parse();
        System.out.println(result);
        
        String resultMessage = result.getIsValid() ? "VALID SYNTAX!" : "SYNTAX ERROR!";
        Color resultLabelForeground = result.getIsValid() ? Color.GREEN : Color.RED;
        resultLabel.setText(resultMessage);
        resultLabel.setForeground(resultLabelForeground);
        
        console.removeAll();
        if (!result.getIsValid()) {
            console.revalidate();
            console.repaint();
            return;
        }
        
        for (StatementData statement : result.getStatements()) {
            JLabel label = new JLabel(HtmlFormatter.formatHtml(statement.getText(), statement.getEscapeSequences()));
            label.setForeground(Color.WHITE);
            console.setLayout(new BoxLayout(console, BoxLayout.Y_AXIS));
            console.add(label);
        }
        console.revalidate();
        console.repaint();
        parsingResultHeader.revalidate();
        parsingResultHeader.repaint();
    }//GEN-LAST:event_textEditorBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel console;
    private javax.swing.JPanel consoleContainer;
    private javax.swing.JPanel consoleHeader;
    private javax.swing.JPanel guiHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel parsingResultHeader;
    private javaswingdev.SimpleTitleBar simpleTitleBar1;
    private javaswingdev.SimpleTitleBar simpleTitleBar2;
    private javax.swing.JPanel syntaxGuildlineContainer;
    private javax.swing.JTextArea textEditor;
    private javax.swing.JButton textEditorBtn;
    private javax.swing.JPanel textEditorContainer;
    private javax.swing.JPanel textEditorHeader;
    // End of variables declaration//GEN-END:variables
}
