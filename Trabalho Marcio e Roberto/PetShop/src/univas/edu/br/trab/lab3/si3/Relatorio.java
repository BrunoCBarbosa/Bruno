package univas.edu.br.trab.lab3.si3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Relatorio {
	
	
	
	
	//criar o grafico
	public JFreeChart createChart(String chartTitle){
		DefaultCategoryDataset dataSet = createDataset();
		
		JFreeChart lineChart = ChartFactory.createLineChart(
															chartTitle,
															"Dias",
															"Vendas(R$)",
															dataSet,
															PlotOrientation.VERTICAL,
															true,true,false);
		return lineChart;
	}
	
	//Cria um dataSet
	private DefaultCategoryDataset createDataset(){
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		//informações cachorro
		dataset.addValue(1500, "Cachorro", "Segunda");
		dataset.addValue(500, "Cachorro", "Terça");
		dataset.addValue(1000, "Cachorro", "Quarta");
		dataset.addValue(1200, "Cachorro", "Quinta");
		dataset.addValue(1250, "Cachorro", "Sexta");
		
		//informações gato
		dataset.addValue(500, "Gato", "Segunda");
		dataset.addValue(1000, "Gato", "Terça");
		dataset.addValue(450, "Gato", "Quarta");
		dataset.addValue(900, "Gato", "Quinta");
		dataset.addValue(1100, "Gato", "Sexta");
		
		return dataset;
	}
	
	//salva o gráfico no arquivo
	public void saveToFile(String fileName, JFreeChart chart){
		int width = 560; //altura da imagem
		int height = 370; //largura da imagem
		File pieChart = new File(fileName);
		try{
			ChartUtilities.saveChartAsJPEG(pieChart,chart,width,height);
		}catch(IOException e){
			System.out.println("Erro ao salvar o arquivo do gráfico.");
			e.printStackTrace();
		}
	}

	
	
}
