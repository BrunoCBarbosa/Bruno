package univas.edu.br.trab.lab3.si3;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Relatorio {
	
	//criar o grafico
		public JFreeChart createChart(String charTitle){
			DefaultCategoryDatabase dataSet = createDataSet();
			
			JFreeChart lineChart = ChartFactory.createLineChart(
																chartTitle,
																"Dias",
																"Vendas",
																dataSet,
																PlotOrientation.VERTICAL,
																true,true,false);
			return lineChart;
		}
		
		//Cria um dataSet
		private DefaultCategoryDataset createDataset(){
			DefaultCategoryDataset dataset = new DefaultCategoryDataset();
			
			//informações cachorro
			dataset.addValue(20, "Cachorro", "Segunda");
			dataset.addValue(15, "Cachorro", "Terça");
			dataset.addValue(30, "Cachorro", "Quarta");
			dataset.addValue(10, "Cachorro", "Quinta");
			dataset.addValue(20, "Cachorro", "Sexta");
			
			//informações gato
			dataset.addValue(20, "Gato", "Segunda");
			dataset.addValue(15, "Gato", "Terça");
			dataset.addValue(30, "Gato", "Quarta");
			dataset.addValue(10, "Gato", "Quinta");
			dataset.addValue(20, "Gato", "Sexta");
			
			return dataset;
		}
		
		//salva o gráfico no arquivo
		public void saveToFile(String fileName, JFreeChart chart){
			int width = 560; //altura da imagem
			int heidght = 370; //largura da imagem
			File pieChart = new File(fileName);
			try{
				ChartUtilities.saveChartAsJPEG(pieChart,chart,width,height);
			}catch(IOException e){
				System.out.println("Erro ao salvar o arquivo do gráfico.");
				e.printStackTrace();
			}
		}
}

