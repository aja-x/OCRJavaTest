/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr;
import java.io.File;
import javax.swing.filechooser.*;
/**
 *
 * @author Kuuhaku
 */
public class FileTypeFilter extends FileFilter{
    private final String extension;
    private final String description;
    
    public FileTypeFilter(String extension, String description){
        this.extension = extension;
        this.description = description;
    }

    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
            return true;
        }
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        return this.description + String.format(" (*%s)", extension);
    }
    
}
