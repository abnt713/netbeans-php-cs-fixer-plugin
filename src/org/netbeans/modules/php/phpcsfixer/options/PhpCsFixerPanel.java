/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2013 Sun Microsystems, Inc.
 */
package org.netbeans.modules.php.phpcsfixer.options;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.filechooser.FileFilter;
import org.netbeans.modules.php.api.util.StringUtils;
import org.netbeans.modules.php.phpcsfixer.commands.PhpCsFixer;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

final class PhpCsFixerPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 8727885479187122174L;
    private final PhpCsFixerOptionsPanelController controller;
    private static final String PHPCSFIXER_LAST_FOLDER_SUFFIX = ".phpcsfixer"; // NOI18N

    private int version;
    // 1.x
    private boolean useLevel;
    private boolean useConfig;
    private boolean useFixers;
    private String level;
    private String config;
    private String fixers;
    // 2.x
    private boolean useRules;
    private String rules;
    // common
    private boolean useCustom;
    private boolean showOutputWindow;
    private boolean isRunOnSave;
    private boolean isVerbose;
    private boolean isDiff;
    private String custom;

    PhpCsFixerPanel(PhpCsFixerOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pathLabel = new javax.swing.JLabel();
        pathTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        phpCsFixerNameLabel = new javax.swing.JLabel();
        optionsPanel = new org.netbeans.modules.php.phpcsfixer.options.PhpCsFixerOptionsPanel();
        downloadButton = new javax.swing.JButton();
        showOutputWindowCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(pathLabel, org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.pathLabel.text")); // NOI18N

        pathTextField.setText(org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.pathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(phpCsFixerNameLabel, org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.phpCsFixerNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(downloadButton, org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.downloadButton.text")); // NOI18N
        downloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(showOutputWindowCheckBox, org.openide.util.NbBundle.getMessage(PhpCsFixerPanel.class, "PhpCsFixerPanel.showOutputWindowCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pathLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phpCsFixerNameLabel)
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pathTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(downloadButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showOutputWindowCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathLabel)
                    .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton)
                    .addComponent(downloadButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phpCsFixerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showOutputWindowCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @NbBundle.Messages("LBL_SelectPhpCsFixer=Select PHP CS Fixer")
    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        File phpcsfixer = new FileChooserBuilder(PhpCsFixerPanel.class.getName() + PHPCSFIXER_LAST_FOLDER_SUFFIX)
                .setTitle(Bundle.LBL_SelectPhpCsFixer())
                .setFilesOnly(true)
                .setFileFilter(new FileFilterImpl())
                .showOpenDialog();
        if (phpcsfixer != null) {
            phpcsfixer = FileUtil.normalizeFile(phpcsfixer);
            if (phpcsfixer.getName().equals(PhpCsFixer.NAME_LONG) || phpcsfixer.getName().equals(PhpCsFixer.NAME)) {
                setPath(phpcsfixer.getAbsolutePath());
            } else {
                setPath(""); // NOI18N
            }
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    @NbBundle.Messages("LBL_SelectDonwloadFolder=Select download folder")
    private void downloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadButtonActionPerformed
        File downloadDirectory = new FileChooserBuilder(PhpCsFixerPanel.class.getName() + PHPCSFIXER_LAST_FOLDER_SUFFIX)
                .setTitle(Bundle.LBL_SelectDonwloadFolder())
                .setDirectoriesOnly(true)
                .showOpenDialog();
        if (downloadDirectory != null) {
            downloadDirectory = FileUtil.normalizeFile(downloadDirectory);
            // has phpcsfixer file?
            FileObject downloadFileObject = FileUtil.toFileObject(downloadDirectory);
            FileObject[] children = downloadFileObject.getChildren();
            for (FileObject child : children) {
                if (!child.isFolder() && child.getNameExt().equals(PhpCsFixer.NAME_LONG)) {
                    try {
                        setPath(FileUtil.toFile(child).getCanonicalPath());
                    } catch (IOException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                    return;
                }
            }

            // create file
            File file = new File(downloadDirectory, PhpCsFixer.NAME_LONG);
            try (FileOutputStream outputStream = new FileOutputStream(file)) {
                URL downloadUrl = new URL(PhpCsFixer.DOWNLOAD_URL);
                InputStream inputStream = downloadUrl.openStream();
                int data;
                while ((data = inputStream.read()) != -1) {
                    outputStream.write(data);
                }
                setPath(file.getCanonicalPath());
                // run self-update because it might be an old version
                new PhpCsFixer(file.getCanonicalPath()).selfUpdate(null);
            } catch (MalformedURLException ex) {
                if (file.exists()) {
                    file.delete();
                }
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                if (file.exists()) {
                    file.delete();
                }
                downloadButton.setEnabled(false);
            }
        }
    }//GEN-LAST:event_downloadButtonActionPerformed

    void load() {
        PhpCsFixerOptions options = getOptions();
        setPath(options.getPhpCsFixerPath());
        setShowOutputWindow(options.showOutputWindow());

        // original options
        version = options.getVersion();
        showOutputWindow = options.showOutputWindow();

        // 1.x
        useLevel = options.useLevel();
        level = options.getLevel();
        useConfig = options.useConfig();
        config = options.getConfig();
        useFixers = options.useFixers();
        fixers = options.getFixers();

        // 2.x
        useRules = options.useRules();
        rules = options.getRules();

        // common
        useCustom = options.useCustom();
        custom = options.getCustom();
        isRunOnSave = options.isRunOnSave();
        isVerbose = options.isVerbose();
        isDiff = options.isDiff();

        optionsPanel.setVersion(version);
        // 1.x
        optionsPanel.setLevel(useLevel);
        optionsPanel.setLevel(level);
        optionsPanel.setConfig(useConfig);
        optionsPanel.setConfig(config);
        optionsPanel.setFixers(useFixers);
        optionsPanel.setFixers(fixers);

        // 2.x
        optionsPanel.setRules(useRules);
        optionsPanel.setRules(rules);

        // common
        optionsPanel.setCustom(useCustom);
        optionsPanel.setCustom(custom);
        optionsPanel.setRunOnSave(isRunOnSave);
        optionsPanel.setVerbose(isVerbose);
        optionsPanel.setDiff(isDiff);
        downloadButton.setEnabled(true);
    }

    void store() {
        PhpCsFixerOptions options = getOptions();
        String path = getPath();
        if (path.endsWith(PhpCsFixer.NAME) || path.endsWith(PhpCsFixer.NAME_LONG)) {
            options.setPhpCsFixerPath(getPath());
        } else {
            options.setPhpCsFixerPath(""); // NOI18N
        }

        if (showOutputWindow != showOutputWindow()) {
            options.setShowOutputWindow(showOutputWindow());
        }

        if (version != optionsPanel.getVersion()) {
            options.setVersion(optionsPanel.getVersion());
        }
        // 1.x
        if (useLevel != optionsPanel.useLevel()) {
            options.setLevel(optionsPanel.useLevel());
        }
        if (!level.equals(optionsPanel.getLevel())) {
            options.setLevel(optionsPanel.getLevel());
        }
        if (useConfig != optionsPanel.useConfig()) {
            options.setConfig(optionsPanel.useConfig());
        }
        if (!config.equals(optionsPanel.getConfig())) {
            options.setConfig(optionsPanel.getConfig());
        }
        if (useFixers != optionsPanel.useFixers()) {
            options.setFixers(optionsPanel.useFixers());
        }
        if (!fixers.equals(optionsPanel.getFixers())) {
            options.setFixers(optionsPanel.getFixers());
        }
        // 2.x
        if (useRules != optionsPanel.useRules()) {
            options.setRules(optionsPanel.useRules());
        }
        if (!rules.equals(optionsPanel.getRules())) {
            options.setRules(optionsPanel.getRules());
        }
        if (useCustom != optionsPanel.useCustom()) {
            options.setCustom(optionsPanel.useCustom());
        }
        // common
        if (!custom.equals(optionsPanel.getCustom())) {
            options.setCustom(optionsPanel.getCustom());
        }
        if (isRunOnSave != optionsPanel.isRunOnSave()) {
            options.setRunOnSave(optionsPanel.isRunOnSave());
        }
        if (isVerbose != optionsPanel.isVerbose()) {
            options.setVerbose(optionsPanel.isVerbose());
        }
        if (isDiff != optionsPanel.isDiff()) {
            options.setDiff(optionsPanel.isDiff());
        }
    }

    private PhpCsFixerOptions getOptions() {
        return PhpCsFixerOptions.getInstance();
    }

    public void setPath(String path) {
        pathTextField.setText(path);
    }

    public String getPath() {
        return pathTextField.getText();
    }

    public void setShowOutputWindow(boolean show) {
        showOutputWindowCheckBox.setSelected(show);
    }

    public boolean showOutputWindow() {
        return showOutputWindowCheckBox.isSelected();
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        String path = pathTextField.getText();
        return !StringUtils.isEmpty(path);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton downloadButton;
    private org.netbeans.modules.php.phpcsfixer.options.PhpCsFixerOptionsPanel optionsPanel;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JTextField pathTextField;
    private javax.swing.JLabel phpCsFixerNameLabel;
    private javax.swing.JCheckBox showOutputWindowCheckBox;
    // End of variables declaration//GEN-END:variables

    private static class FileFilterImpl extends FileFilter {

        public FileFilterImpl() {
        }

        @Override
        public boolean accept(File f) {
            if (f.isDirectory()) {
                return true;
            }
            String name = f.getName();
            return f.isFile() && name.startsWith(PhpCsFixer.NAME);
        }

        @Override
        public String getDescription() {
            return PhpCsFixer.NAME + " or " + PhpCsFixer.NAME_LONG;  // NOI18N
        }
    }
}
