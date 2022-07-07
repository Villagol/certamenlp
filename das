<target name="-post-jar">
        <echo file="${dist.dir}/run.bat">
            start javaw -jar ${application.title}.jar
        </echo>
        <zip 
            destfile="${dist.dir}/${application.title}.zip" 
            basedir="${dist.dir}" />
    </target> 
</project>



main --> propiedades ---> run--> ok
